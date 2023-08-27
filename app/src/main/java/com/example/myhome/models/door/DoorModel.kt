package com.example.myhome.models.door

import com.google.gson.annotations.SerializedName

data class DoorModel(
    @SerializedName("data")
    val data: List<DataItem>?,
    @SerializedName("success")
    val success: Boolean = false,
)