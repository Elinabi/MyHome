package com.example.myhome.models.door

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("favorites")
    val favorites: Boolean = false,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("room")
    val room: String = "",
)