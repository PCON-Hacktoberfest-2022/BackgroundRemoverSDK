package com.ersubhadip.removebg.api

import com.ersubhadip.removebg.Models.PostUrl
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface apiInterface {

    @POST()
    suspend fun postImageUrl(
       @Body post:PostUrl):Response<PostUrl>
}