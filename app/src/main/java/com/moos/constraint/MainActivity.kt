package com.moos.constraint

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.moos.constraint.practice.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = EntranceListAdapter()
        recyclerView.adapter = adapter
        adapter.setOnEntranceSelectListener {
            when(it) {
                0 -> startActivity(Intent(this, MotionSampleActivity::class.java))
                1 -> startActivity(Intent(this, MultiBallActivity::class.java))
                2 -> startActivity(Intent(this, AppBarMotionActivity::class.java))
                3 -> startActivity(Intent(this, DrawerMotionActivity::class.java))
                4 -> startActivity(Intent(this, LottieMotionActivity::class.java))
            }
        }
    }
}
