package com.example.myhome.models.camera

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("cameras")
    val cameras: CamerasItem,
    @SerializedName("room")
    val room: List<String>?,
)