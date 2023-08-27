package com.example.myhome.data.repositories

import com.example.myhome.data.remote.apiservices.DoorApiServices
import com.example.myhome.data.repositories.base.BaseRepository
import com.example.myhome.models.camera.CamerasItem
import com.example.myhome.models.door.DataItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DoorRepository @Inject constructor(
    private val doorApiServices: DoorApiServices
): BaseRepository() {

    fun fetchDoor(): Flow<DataItem> = flow {
        val doorApiServices = doorApiServices.fetchDoors()
        emit(doorApiServices)
    }
}