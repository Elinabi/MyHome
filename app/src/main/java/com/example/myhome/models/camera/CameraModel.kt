package com.example.myhome.models.camera

import com.google.gson.annotations.SerializedName

data class CameraModel<T>(
    @SerializedName("data")
    val data: Data,
    @SerializedName("success")
    val success: Boolean = false,
)