package com.callblackbox
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginService{

    //서버와 통신하기 위해서 로그인 리퀘스트 funtion을 만듦,

    @FormUrlEncoded //인코딩

    @POST("/login/") // 실제서버 제외한 url

    fun requestLogin(
        // input을 정의 하는 곳
        @Field("userid") userid:String, //서버에서 post로 쏴주는 값이 userid
        @Field("userpw") userpw:String, //서버에서 post로 쏴주는 값이 userpw
    ) : Call<Login>  //output을 정의 하는 곳

}