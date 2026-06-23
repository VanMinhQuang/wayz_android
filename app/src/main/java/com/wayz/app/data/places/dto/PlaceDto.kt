package com.wayz.app.data.places.dto

import com.google.gson.annotations.SerializedName

data class PlaceDto(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)
