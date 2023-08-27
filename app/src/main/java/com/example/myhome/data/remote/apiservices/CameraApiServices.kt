package com.example.myhome.data.remote.apiservices

import com.example.myhome.models.camera.CamerasItem
import retrofit2.http.GET

interface CameraApiServices {

    @GET("cameras/")
    suspend fun fetchCamera(
    ): CamerasItem
}