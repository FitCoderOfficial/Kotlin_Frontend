package com.callblackbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //레트로핏 객체 생성성
        var rerofit = Retrofit.Builder()
            .baseUrl("http://agapeace.com:8000") // rest api 서버 주소
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        //생성된 레트로핏을 통해 인풋 아웃풋을 넣어주는 인터페이스
        val loginService = rerofit.create(LoginService::class.java)


        //인풋
        loginService.requestLogin(textId, textPw).enqueue(object: Callback<Login>{
            override fun onFailure(call: Call<Login>, t: Throwable) {
                //웹통신 실패했을 때 통신되는 코드
                val dialog = AlertDialog.Builder(this@LoginActivity)
                dialog.setTitle("실패")
                dialog.setMessage("접속 실패했습니다.")
                dialog.show()
            }

            override fun onResponse(call: Call<Login>, response: Response<Login>) {
                //웹통신 성공했을 때 통신되는 코드
                var login = response.body() //코드값과 메세지를 넣음

                var dialog = AlertDialog.Builder(this@LoginActivity)
                dialog.setTitle("알림!")
                dialog.setMessage("code = " + login?.code + ", msg = " + login?.msg)
                dialog.show()
            }

        })


        btn_register.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }


    }
}