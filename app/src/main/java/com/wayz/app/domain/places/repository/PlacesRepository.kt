package com.wayz.app.domain.places.repository

import com.wayz.app.domain.places.model.Place

interface PlacesRepository {
    suspend fun getPlaces(): Result<List<Place>>
}
