package com.example.myhome.ui.fragments.doors

import com.example.myhome.data.repositories.DoorRepository
import com.example.myhome.ui.fragments.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DoorsViewModel @Inject constructor(
    private val doorRepository: DoorRepository
): BaseViewModel() {

    fun fetchDoor() = doorRepository.fetchDoor()
}