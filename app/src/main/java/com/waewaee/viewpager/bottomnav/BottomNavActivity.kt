package com.waewaee.viewpager.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.waewaee.cosmetics.FirstFragment
import com.waewaee.cosmetics.SecondFragment
import com.waewaee.cosmetics.ThirdFragment
import com.waewaee.viewpager.R
import kotlinx.android.synthetic.main.activity_bottom_nav2.*

class BottomNavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav2)
//        navigationView.selectedItemId = R.id.navigationSongs
        supportActionBar!!.title = "Songs"
        openFragment(FirstFragment.newInstance())
        navigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.navigationSongs -> {
                    supportActionBar!!.title = "Songs"
                    val songsFragment = FirstFragment.newInstance()
                    openFragment(songsFragment)
                    return@OnNavigationItemSelectedListener true
                }

                R.id.navigationAlbums -> {
                supportActionBar!!.title = "Albums"
                val albumsFragment = SecondFragment.newInstance()
                openFragment(albumsFragment)
                return@OnNavigationItemSelectedListener true
                }

                R.id.navigationArtists -> {
                supportActionBar!!.title = "Artists"
                val artistsFragment = ThirdFragment.newInstance()
                openFragment(artistsFragment)
                return@OnNavigationItemSelectedListener true
                }
            }
            false
        })
    }

    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}