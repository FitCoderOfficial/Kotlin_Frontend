package com.callblackbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행했을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰를 연결


        btn_get.setOnClickListener{
            var resultText = et_id.text.toString()
            tv_title.setText(resultText)

        }
        tv_title.setText("Hello World..")


    }
}