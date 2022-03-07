package com.example.retrofitbestpractice.api.model

data class ResponseListErrors<T>(
    val status: String,
    var data: List<T>,
    var message: String
)