package com.wayz.app.data.social.api

import com.wayz.app.data.social.dto.PostDto
import retrofit2.http.GET

interface SocialApi {
    @GET("social/feed")
    suspend fun getFeed(): List<PostDto>
}
