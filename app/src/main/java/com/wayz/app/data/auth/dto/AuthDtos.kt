package com.wayz.app.data.auth.dto

import com.google.gson.annotations.SerializedName

data class LoginRequestDto(
    @SerializedName("phone") val phone: String,
    @SerializedName("pin") val pin: String
)

data class AuthTokensDto(
    @SerializedName("accessToken") val accessToken: String,
    @SerializedName("refreshToken") val refreshToken: String
)
