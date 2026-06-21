package com.wayz.app.features.places.data

import retrofit2.http.GET

interface PlacesApi {
    @GET("places")
    suspend fun getPlaces(): List<PlaceDto>
}

data class PlaceDto(val id: String, val name: String)
