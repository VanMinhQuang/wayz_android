package com.wayz.app.data.social.dto

import com.google.gson.annotations.SerializedName

data class PostDto(
    @SerializedName("id") val id: String,
    @SerializedName("content") val content: String
)
