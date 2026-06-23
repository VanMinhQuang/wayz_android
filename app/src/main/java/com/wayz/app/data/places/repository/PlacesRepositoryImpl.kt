package com.wayz.app.data.places.repository

import com.wayz.app.data.places.api.PlacesApi
import com.wayz.app.data.places.dto.PlaceDto
import com.wayz.app.domain.places.model.Place
import com.wayz.app.domain.places.repository.PlacesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlacesRepositoryImpl @Inject constructor(
    private val placesApi: PlacesApi
) : PlacesRepository {
    override suspend fun getPlaces(): Result<List<Place>> {
        return try {
            val response = placesApi.getPlaces()
            val places = response.map { dto ->
                Place(id = dto.id, name = dto.name)
            }
            Result.success(places)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
