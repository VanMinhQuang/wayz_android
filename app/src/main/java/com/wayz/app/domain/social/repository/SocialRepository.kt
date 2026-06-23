package com.wayz.app.domain.social.repository

import com.wayz.app.domain.social.model.Post

interface SocialRepository {
    suspend fun getFeed(): Result<List<Post>>
}
