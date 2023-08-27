package com.example.myhome.data.repositories

import com.example.myhome.data.remote.apiservices.CameraApiServices
import com.example.myhome.data.repositories.base.BaseRepository
import com.example.myhome.models.camera.CamerasItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CameraRepository @Inject constructor(
    private val cameraApiServices: CameraApiServices
): BaseRepository() {

    fun fetchCamera(): Flow<CamerasItem> = flow {
        val cameraApiServices = cameraApiServices.fetchCamera()
        emit(cameraApiServices)
    }
}