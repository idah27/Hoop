package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.HoopViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val chatsfragment by lazy { ChatsFragment.newInstance() }
    private val camerafragment by lazy { CameraFragment.newInstance() }
    private val statusfragment by lazy { StatusFragment.newInstance() }
    private val callsfragment by lazy { CallsFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = ArrayList<Fragment>()
        val titleList = ArrayList<String>()
        fragment.add(camerafragment)
        fragment.add(chatsfragment)
        fragment.add(statusfragment)
        fragment.add(callsfragment)
        titleList.add("")
        titleList.add("Chats")
        titleList.add("Status")
        titleList.add("Calls")
        frm_pagerview.adapter = HoopViewPagerAdapter(fragment, titleList, supportFragmentManager)
        tab_layout.setupWithViewPager(frm_pagerview)
        tab_layout.getTabAt(0)!!.setIcon(R.drawable.ic_cam_gray)
        frm_pagerview.currentItem = 1

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        val id = item!!.itemId

        return super.onOptionsItemSelected(item)
    }
    /*   override fun onClick(v: View?) {
           when (v!!.id) {
               R.id.txt_calls -> {
                   supportFragmentManager.beginTransaction().add(R.id.frm_container, callsfragment).commit()
               }
               R.id.txt_chats -> {
                   supportFragmentManager.beginTransaction().add(R.id.frm_container, chatsfragment).commit()
               }
               R.id.txt_status -> {
                   supportFragmentManager.beginTransaction().add(R.id.frm_container, statusfragment).commit()
               }
               R.id.img_camera -> {
                   supportFragmentManager.beginTransaction().add(R.id.frm_container, camerafragment).commit()
               }
           }
       }*/

}
