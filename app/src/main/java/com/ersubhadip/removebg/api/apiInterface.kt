package com.ersubhadip.removebg.api

import com.ersubhadip.removebg.Models.Constants
import com.ersubhadip.removebg.Models.PostUrl
import retrofit2.Response
import retrofit2.http.*

interface apiInterface {

    @POST("/remove")
    fun postImageUrl(
        @Query("content-type") contentType:String, @Query("x-rapidapi-host")host:String,@Query("x-rapidapi-key")key:String,
        @Body post:PostUrl):Response<PostUrl>
}