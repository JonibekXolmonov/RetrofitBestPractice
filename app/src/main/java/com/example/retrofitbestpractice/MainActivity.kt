package com.example.retrofitbestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.retrofitbestpractice.api.ApiClient
import com.example.retrofitbestpractice.api.ApiService
import com.example.retrofitbestpractice.api.model.ResponseListErrors
import com.example.retrofitbestpractice.model.Employee
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var service: ApiService
    private lateinit var call: Call<ResponseListErrors<Employee>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        service = ApiClient.createService(ApiService::class.java)
        call = service.getEmployees()
        call.enqueue(object : Callback<ResponseListErrors<Employee>> {
            override fun onResponse(
                call: Call<ResponseListErrors<Employee>>,
                response: Response<ResponseListErrors<Employee>>
            ) {
                if (response.isSuccessful && response.body() != null)
                    Log.d("TAG", "onResponse: ${response.body().toString()}")
                else
                    Log.d("TAG", "onResponse: ${response.message()}")
            }

            override fun onFailure(call: Call<ResponseListErrors<Employee>>, t: Throwable) {
                Log.e("TAG", "onFailure: ${t.localizedMessage}")
            }
        })
    }
}