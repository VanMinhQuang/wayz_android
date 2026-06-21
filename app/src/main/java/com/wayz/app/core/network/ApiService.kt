package com.wayz.app.core.network

import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("{path}")
    suspend fun get(
        @Path("path", encoded = true) path: String,
        @QueryMap params: Map<String, String> = emptyMap()
    ): Response<Unit> // Replace Unit with your Generic DTO or use ResponseBody

    @POST("{path}")
    suspend fun post(
        @Path("path", encoded = true) path: String,
        @Body body: Any
    ): Response<Unit>

    @PUT("{path}")
    suspend fun put(
        @Path("path", encoded = true) path: String,
        @Body body: Any
    ): Response<Unit>

    @PATCH("{path}")
    suspend fun patch(
        @Path("path", encoded = true) path: String,
        @Body body: Any
    ): Response<Unit>

    @DELETE("{path}")
    suspend fun delete(
        @Path("path", encoded = true) path: String,
        @QueryMap params: Map<String, String> = emptyMap()
    ): Response<Unit>

    // Specifically for Token Refresh
    @POST("auth/refresh")
    fun refreshTokens(@Body body: Map<String, String>): retrofit2.Call<TokenResponse>
}

data class TokenResponse(val accessToken: String, val refreshToken: String)
