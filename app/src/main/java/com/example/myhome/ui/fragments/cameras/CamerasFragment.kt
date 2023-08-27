package com.example.myhome.ui.fragments.cameras

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myhome.R
import com.example.myhome.databinding.FragmentCamerasBinding
import com.example.myhome.ui.adapter.CameraAdapter
import com.example.myhome.ui.fragments.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CamerasFragment :
    BaseFragment<CamerasViewModel, FragmentCamerasBinding>(R.layout.fragment_cameras) {

    override val binding by viewBinding(FragmentCamerasBinding::bind)
    override val viewModel by viewModels<CamerasViewModel>()
    private var cameraAdapter = CameraAdapter()

    override fun initialise() {
        binding.cameraRecView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = cameraAdapter
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