package com.example.ujikompwpbpetugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tab_icon.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = MyPagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(viewPager)

        //icon for tab layout
        //val icon_tab = LayoutInflater.from(this).inflate(R.layout.fragment_home, null)
        //icon_tab.imageView.setImageResource(R.drawable.ic_view_pager_home)
        //tabs_main.getTabAt(0)?.customView = icon_tab
    }

}
