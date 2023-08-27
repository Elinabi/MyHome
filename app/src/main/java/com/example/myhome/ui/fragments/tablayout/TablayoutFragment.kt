package com.example.myhome.ui.fragments.tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myhome.R
import com.example.myhome.databinding.FragmentTablayoutBinding
import com.example.myhome.ui.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class TablayoutFragment : Fragment() {

    private lateinit var binding: FragmentTablayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentTablayoutBinding.inflate(inflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        val adapter = ViewPagerAdapter(this@TablayoutFragment)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "камеры"
                }
                1 -> {
                    tab.text = "Двери"
                }
            }
        }.attach()
    }
}