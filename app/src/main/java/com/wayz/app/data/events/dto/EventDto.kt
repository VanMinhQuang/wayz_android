package com.wayz.app.data.events.dto

import com.google.gson.annotations.SerializedName

data class EventDto(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String
)
