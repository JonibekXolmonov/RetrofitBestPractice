package com.example.retrofitbestpractice.api

import com.example.retrofitbestpractice.api.model.ResponseListErrors
import com.example.retrofitbestpractice.api.model.ResponseObjectErrors
import com.example.retrofitbestpractice.model.Employee
import com.example.retrofitbestpractice.model.User
import retrofit2.Call
import retrofit2.http.*

@JvmSuppressWildcards
interface ApiService {

//    @POST("user")
//    fun addUser(@Body user: User): User
//
//
////    @POST("user")
////    @FormUrlEncoded
////    fun addUser(@Field("emails") email: String, @Field("password") password: String)
//
//    @GET("user")
//    fun getUsers(): Call<List<User>>
//
//    @GET("employees")
//    fun getEmployees(): Call<ResponseListErrors<Employee>>
//
//    @GET("employee/{id}")
//    fun getEmployee(@Path("id") id: Int): Call<ResponseObjectErrors<Employee>>


}