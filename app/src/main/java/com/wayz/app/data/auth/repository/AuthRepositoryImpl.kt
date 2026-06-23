package com.wayz.app.data.auth.repository

import com.wayz.app.core.session.SessionManager
import com.wayz.app.data.auth.api.AuthApi
import com.wayz.app.data.auth.dto.LoginRequestDto
import com.wayz.app.domain.auth.repository.AuthRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi,
    private val sessionManager: SessionManager
) : AuthRepository {
    override suspend fun login(phone: String, pin: String): Result<Unit> {
        return try {
            val tokens = authApi.login(LoginRequestDto(phone, pin))
            sessionManager.saveTokens(tokens.accessToken, tokens.refreshToken)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
