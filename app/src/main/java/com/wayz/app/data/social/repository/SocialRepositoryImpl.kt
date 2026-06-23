package com.wayz.app.data.social.repository

import com.wayz.app.data.social.api.SocialApi
import com.wayz.app.data.social.dto.PostDto
import com.wayz.app.domain.social.model.Post
import com.wayz.app.domain.social.repository.SocialRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SocialRepositoryImpl @Inject constructor(
    private val socialApi: SocialApi
) : SocialRepository {
    override suspend fun getFeed(): Result<List<Post>> {
        return try {
            val response = socialApi.getFeed()
            val posts = response.map { dto ->
                Post(id = dto.id, content = dto.content)
            }
            Result.success(posts)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
