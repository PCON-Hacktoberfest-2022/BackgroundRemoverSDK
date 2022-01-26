package com.ersubhadip.removebg.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiSingletonObject {

    val api:apiInterface by lazy {
        Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(apiInterface::class.java)
    }
}