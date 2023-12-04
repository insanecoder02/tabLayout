package com.example.timelime

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(
    lifecycle: FragmentManager,
    fragmentManager: Lifecycle
) :FragmentStateAdapter(lifecycle,fragmentManager){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return if(position==0){
            FirstFragment()
        }
        else{
            SecondFragment()
        }
    }

}