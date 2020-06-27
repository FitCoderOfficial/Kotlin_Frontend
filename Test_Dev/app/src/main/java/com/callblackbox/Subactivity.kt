package com.callblackbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_subactivity.*

class Subactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        if(intent.hasExtra("msg"))
//        {
//
//            tv_getmsg.text = intent.getStringExtra( "msg")
//
//        }




        setContentView(R.layout.activity_subactivity)
    }
}