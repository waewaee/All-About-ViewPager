package com.waewaee.viewpager.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.waewaee.cosmetics.FirstFragment
import com.waewaee.cosmetics.SecondFragment
import com.waewaee.cosmetics.ThirdFragment
import com.waewaee.viewpager.FragmentVPAdapter
import com.waewaee.viewpager.R
import kotlinx.android.synthetic.main.activity_bottom_nav.*

class BottomNavVPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        navigationView.selectedItemId = R.id.navigationSongs
        viewpager.adapter = FragmentVPAdapter(supportFragmentManager)
        navigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigationSongs -> {
                    supportActionBar!!.title = "Songs"
                    viewpager.currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigationAlbums -> {
                supportActionBar!!.title = "Albums"
                    viewpager.currentItem = 1
                return@OnNavigationItemSelectedListener true
                }

                R.id.navigationArtists -> {
                supportActionBar!!.title = "Artists"
                    viewpager.currentItem = 2
                return@OnNavigationItemSelectedListener true
                }
            }
            false
        })

        viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        supportActionBar!!.title = "Songs"
                        navigationView.menu.findItem(R.id.navigationSongs).isChecked = true
                    }
                    1 -> {
                        supportActionBar!!.title = "Albums"
                        navigationView.menu.findItem(R.id.navigationAlbums).isChecked = true
                    }
                    2 -> {
                        supportActionBar!!.title = "Artists"
                        navigationView.menu.findItem(R.id.navigationArtists).isChecked = true
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

}