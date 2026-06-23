package com.wayz.app.data.places.api

import com.wayz.app.data.places.dto.PlaceDto
import retrofit2.http.GET

interface PlacesApi {
    @GET("places")
    suspend fun getPlaces(): List<PlaceDto>
}
