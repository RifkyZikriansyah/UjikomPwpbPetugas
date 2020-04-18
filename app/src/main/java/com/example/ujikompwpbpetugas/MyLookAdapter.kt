//package com.example.ujikompwpbpetugas
//
//import androidx.fragment.app.Fragment
//import androidx.fragment.app.FragmentManager
//import androidx.fragment.app.FragmentPagerAdapter
//
//class MyLookAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
//
//    //Menampung Objek
//    private val pages = listOf(
//        ProcessLookFragment(),
//        ClearLookFragment()
//    )
//
//    override fun getItem(position: Int): Fragment {
//        return pages[position]
//    }
//
//    override fun getCount(): Int {
//        return pages.size
//    }
//
//    override fun getPageTitle(position: Int): CharSequence? {
//        return when(position){
//            0 -> "Process"
//            else -> "Clear"
//
//        }
//    }
//
//}