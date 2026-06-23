package com.wayz.app.domain.events.repository

import com.wayz.app.domain.events.model.Event

interface EventsRepository {
    suspend fun getEvents(): Result<List<Event>>
}
