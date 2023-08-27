package com.example.myhome.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myhome.ui.fragments.cameras.CamerasFragment
import com.example.myhome.ui.fragments.doors.DoorsFragment

class ViewPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 2

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> CamerasFragment()
                else -> DoorsFragment()
            }
        }
}