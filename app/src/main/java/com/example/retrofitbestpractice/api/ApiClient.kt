package com.example.retrofitbestpractice.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    var BASE_URl = "http://dummy.restapiexample.com/api/v1/"

    fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URl)
            .build()

    }

    fun <T> createService(service: Class<T>): T {
        return getRetrofit().create(service)
    }
}