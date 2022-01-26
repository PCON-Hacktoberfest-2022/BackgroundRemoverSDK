package com.ersubhadip.removebg.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ersubhadip.removebg.api.ApiRepository

class ViewModelFactory(val apiRepository: ApiRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel(apiRepository) as T
    }
}