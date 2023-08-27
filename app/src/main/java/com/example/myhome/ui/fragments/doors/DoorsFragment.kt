package com.example.myhome.ui.fragments.doors

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myhome.R
import com.example.myhome.databinding.FragmentCamerasBinding
import com.example.myhome.ui.adapter.CameraAdapter
import com.example.myhome.ui.adapter.DoorAdapter
import com.example.myhome.ui.fragments.base.BaseFragment
import com.example.myhome.ui.fragments.cameras.CamerasViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DoorsFragment :
    BaseFragment<CamerasViewModel, FragmentCamerasBinding>(R.layout.fragment_cameras) {

    override val binding by viewBinding(FragmentCamerasBinding::bind)
    override val viewModel by viewModels<CamerasViewModel>()
    private var doorAdapter = DoorAdapter()

    override fun initialise() {
        binding.cameraRecView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = doorAdapter
        }
    }

    override fun setupObserves() {
        lifecycleScope.launch {
            viewModel.fetchCamera().collect() {
                Toast.makeText(requireActivity(), "camera", Toast.LENGTH_LONG).show()
                Log.e("camera", "setupObserves: anime")
                it
            }
        }
    }

}