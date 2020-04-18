package com.example.ujikompwpbpetugas

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){

    //Menampung Objek
    private val pages = listOf(
        HomeFragment(),
        LookFragment(),
        MakeFragment(),
        ProfileFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Home"
            1 -> "Look"
            2 -> "Make"
            else -> "Profile"
        }
    }

}