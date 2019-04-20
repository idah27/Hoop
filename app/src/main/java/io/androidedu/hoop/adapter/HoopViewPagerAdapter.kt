package io.androidedu.hoop.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class HoopViewPagerAdapter(
    val fragmentlist: ArrayList<Fragment>,
    val title: ArrayList<String>,
    frmmenager: FragmentManager
) : FragmentStatePagerAdapter(frmmenager) {
    override fun getItem(position: Int): Fragment = fragmentlist[position]
    override fun getCount(): Int = fragmentlist.size
    override fun getPageTitle(position: Int): CharSequence? = title[position]
}