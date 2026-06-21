
package com.wayz.app.core.network

import com.wayz.app.core.session.SessionManager
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject
import javax.inject.Provider

class TokenAuthenticator @Inject constructor(
    private val sessionManager: SessionManager,
    private val apiServiceProvider: Provider<ApiService> // Use Provider to avoid circular dependency
) : Authenticator {

    override fun authenticate(route: Route?, response: Response): Request? {
        val refreshToken = runBlocking { sessionManager.refreshTokenFlow.first() }

        if (refreshToken.isNullOrEmpty()) return null

        // Try to get a new token synchronously
        val res =
            apiServiceProvider.get().refreshTokens(mapOf("refresh_token" to refreshToken)).execute()

        return if (res.isSuccessful && res.body() != null) {
            val newTokens = res.body()!!
            runBlocking {
                sessionManager.saveTokens(newTokens.accessToken, newTokens.refreshToken)
            }
            // Retry the original request with the new access token
            response.request.newBuilder()
                .header("Authorization", "Bearer ${newTokens.accessToken}")
                .build()
        } else {
            // If refresh fails, log out user
            runBlocking { sessionManager.clearSession() }
            null
        }
    }
}
