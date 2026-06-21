package com.wayz.app.features.auth.data

import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): AuthTokens
}

data class LoginRequest(val phone: String, val pin: String)
data class AuthTokens(val accessToken: String, val refreshToken: String)
