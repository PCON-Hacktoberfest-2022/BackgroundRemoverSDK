package com.ersubhadip.removebg.api

import com.ersubhadip.removebg.Models.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiSingletonObject {

    val api:apiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(apiInterface::class.java)
    }
}