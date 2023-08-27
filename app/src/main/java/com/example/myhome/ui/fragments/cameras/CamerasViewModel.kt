package com.example.myhome.ui.fragments.cameras

import com.example.myhome.data.repositories.CameraRepository
import com.example.myhome.ui.fragments.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CamerasViewModel @Inject constructor(
    private val cameraRepository: CameraRepository
) : BaseViewModel() {

    fun fetchCamera() = cameraRepository.fetchCamera()
}