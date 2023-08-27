package com.example.myhome.models.camera

import com.google.gson.annotations.SerializedName

data class CamerasItem(
    @SerializedName("favorites")
    val favorites: Boolean = false,
    @SerializedName("rec")
    val rec: Boolean = false,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("snapshot")
    val snapshot: String = "",
    @SerializedName("room")
    val room: String = "",
)