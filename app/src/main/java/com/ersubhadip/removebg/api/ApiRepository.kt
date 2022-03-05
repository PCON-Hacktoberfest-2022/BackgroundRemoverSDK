package com.ersubhadip.removebg.api

import com.ersubhadip.removebg.Models.Constants
import com.ersubhadip.removebg.Models.PostUrl
import retrofit2.Response

class ApiRepository {

    fun getImage(postUrl: PostUrl):Response<PostUrl>{
        return ApiSingletonObject.api.postImageUrl("application/x-www-form-urlencoded","background-removal.p.rapidapi.com",Constants.KEY,postUrl)
        }
    }
