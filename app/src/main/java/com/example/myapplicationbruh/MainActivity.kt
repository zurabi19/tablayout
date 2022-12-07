package com.example.myapplicationbruh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplicationbruh.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    lateinit var viewPagerFragmentAdapter:ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout=findViewById(R.id.tab)
        viewPager2=findViewById(R.id.pager)
        viewPagerFragmentAdapter= ViewPagerFragmentAdapter(this)

        viewPager2.adapter=viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout,viewPager2){
            tab,position->
            tab.text="tab${position+1}"
        }.attach()
    }
}