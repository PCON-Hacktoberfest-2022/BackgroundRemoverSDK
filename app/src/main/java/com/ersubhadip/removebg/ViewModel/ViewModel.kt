package com.ersubhadip.removebg.ViewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ersubhadip.removebg.Models.PostUrl
import com.ersubhadip.removebg.api.ApiRepository

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ViewModel(val repository: ApiRepository):ViewModel() {

    fun postImageUrl(postUrl: PostUrl){
        viewModelScope.launch() {
            //calling the Api
            val response = repository.getImage(postUrl)
            val res = response.body()   //make it null safety
            Log.d("###",res.toString()) //junk

        }
    }

}