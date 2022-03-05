package com.ersubhadip.removebg.ViewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ersubhadip.removebg.Models.PostUrl
import com.ersubhadip.removebg.api.ApiRepository
import kotlinx.coroutines.launch


class ViewModel(val repository: ApiRepository):ViewModel(){



       fun getFinalImage(postUrl: PostUrl){
          viewModelScope.launch {

          }
              val result = repository.getImage(postUrl).body()!!
              Log.d("###",result.toString())

      }

}