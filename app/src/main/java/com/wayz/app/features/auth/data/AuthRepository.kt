package com.wayz.app.features.auth.data

import com.wayz.app.core.session.SessionManager
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authApi: AuthApi,
    private val sessionManager: SessionManager
) {
    suspend fun login(phone: String, pin: String): Result<Unit> {
        return try {
            val tokens = authApi.login(LoginRequest(phone, pin))
            sessionManager.saveTokens(tokens.accessToken, tokens.refreshToken)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
