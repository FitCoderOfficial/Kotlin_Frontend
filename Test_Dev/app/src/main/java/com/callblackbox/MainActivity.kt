package com.callblackbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) { //앱이 최초 실행했을 때 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //xml 화면 뷰를 연결


        btn_get.setOnClickListener {
            var resultText = et_id.text.toString()
            tv_title.setText(resultText + "님 반갑습니다.")

        }

        btn_sub.setOnClickListener {
            // var는 변수를 의미 val 자바에서 final을 의미, 변경되지 못하는 변수
            val intent = Intent(this, Subactivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체

            //intent.putExtra( "msg", msg_sending.text.toString()) //타이틀 텍스트를 msg라는 키값으로 묶음
            startActivity(intent)
            finish()

        }




    }
}