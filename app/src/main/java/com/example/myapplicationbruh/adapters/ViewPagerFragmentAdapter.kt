package com.example.myapplicationbruh.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplicationbruh.fragments.fragment1
import com.example.myapplicationbruh.fragments.fragment2
import com.example.myapplicationbruh.fragments.fragment3

class ViewPagerFragmentAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return fragment1()
            1 -> return fragment2()
            2 -> return fragment3()
            else-> return Fragment()




        }
    }
}