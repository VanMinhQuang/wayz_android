package com.wayz.app.features.events.data

import retrofit2.http.GET

interface EventsApi {
    @GET("events")
    suspend fun getEvents(): List<EventDto>
}

data class EventDto(val id: String, val title: String)
