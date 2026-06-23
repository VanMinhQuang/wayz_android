package com.wayz.app.domain.auth.repository

interface AuthRepository {
    suspend fun login(phone: String, pin: String): Result<Unit>
}
