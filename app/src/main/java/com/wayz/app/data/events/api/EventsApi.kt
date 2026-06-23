package com.wayz.app.data.events.api

import com.wayz.app.data.events.dto.EventDto
import retrofit2.http.GET

interface EventsApi {
    @GET("events")
    suspend fun getEvents(): List<EventDto>
}
