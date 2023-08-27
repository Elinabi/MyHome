package com.example.myhome.data.remote.apiservices

import com.example.myhome.models.door.DataItem
import com.example.myhome.models.door.DoorModel
import retrofit2.http.GET

interface DoorApiServices {

    @GET("doors/")
    suspend fun fetchDoors(
    ): DataItem
}