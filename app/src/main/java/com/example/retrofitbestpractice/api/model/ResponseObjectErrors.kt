package com.example.retrofitbestpractice.api.model

data class ResponseObjectErrors<T>(
    val status: String,
    var data: T,
    var message: String
)