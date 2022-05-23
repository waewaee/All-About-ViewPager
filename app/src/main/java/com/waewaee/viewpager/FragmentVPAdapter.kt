package com.waewaee.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.waewaee.cosmetics.FirstFragment
import com.waewaee.cosmetics.FourthFragment
import com.waewaee.cosmetics.SecondFragment
import com.waewaee.cosmetics.ThirdFragment

class FragmentVPAdapter(fm: FragmentManager):FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment.newInstance()
            1 -> SecondFragment.newInstance()
            2 -> ThirdFragment.newInstance()
            else -> FirstFragment.newInstance()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}