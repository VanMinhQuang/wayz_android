package com.wayz.app.features.social.data

import retrofit2.http.GET

interface SocialApi {
    @GET("social/feed")
    suspend fun getFeed(): List<PostDto>
}

data class PostDto(val id: String, val content: String)
