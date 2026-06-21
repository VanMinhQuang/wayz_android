package com.wayz.app.core.network

import com.wayz.app.core.session.SessionManager
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

class TokenAuthenticator @Inject constructor(
    private val sessionManager: SessionManager
) : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {
        // Implement token refresh logic here
        // If refresh fails, clear session
        return null // For now, return null to fail the request
    }
}
