package com.example.retrofittest.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.retrofittest.R
import com.example.retrofittest.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class RootFragment : Fragment() {

    private var contextRoot: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        contextRoot = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = view.findViewById<ViewPager2>(R.id.view_pager)
        tabLayout.tabIconTint = null
        viewPager2.adapter = ViewPagerAdapter(contextRoot as FragmentActivity)
        TabLayoutMediator(tabLayout, viewPager2){
            tab,pos ->
            when(pos){
                0->{
                    tab.setIcon(R.drawable.ic_money2)
                }
                1->{
                    tab.setIcon(R.drawable.ic_money1)
                }
            }
        }.attach()
        return view
    }


}