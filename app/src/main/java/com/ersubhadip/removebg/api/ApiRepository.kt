package com.ersubhadip.removebg.api

import com.ersubhadip.removebg.Models.PostUrl
import retrofit2.Response

class ApiRepository {

    suspend fun getImage(postUrl: PostUrl):Response<PostUrl>{
        return ApiSingletonObject.api.postImageUrl(postUrl)
    }
}