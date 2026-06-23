package com.wayz.app.data.auth.api

import com.wayz.app.data.auth.dto.AuthTokensDto
import com.wayz.app.data.auth.dto.LoginRequestDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequestDto): AuthTokensDto
}
