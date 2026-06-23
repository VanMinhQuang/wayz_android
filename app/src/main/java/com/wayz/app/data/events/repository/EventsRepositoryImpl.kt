package com.wayz.app.data.events.repository

import com.wayz.app.data.events.api.EventsApi
import com.wayz.app.data.events.dto.EventDto
import com.wayz.app.domain.events.model.Event
import com.wayz.app.domain.events.repository.EventsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventsRepositoryImpl @Inject constructor(
    private val eventsApi: EventsApi
) : EventsRepository {
    override suspend fun getEvents(): Result<List<Event>> {
        return try {
            val response = eventsApi.getEvents()
            val events = response.map { dto ->
                Event(id = dto.id, title = dto.title)
            }
            Result.success(events)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
