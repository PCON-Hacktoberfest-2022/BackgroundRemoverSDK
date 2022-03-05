package com.ersubhadip.removebg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.ersubhadip.removebg.Models.PostUrl
import com.ersubhadip.removebg.ViewModel.ViewModel
import com.ersubhadip.removebg.ViewModel.ViewModelFactory
import com.ersubhadip.removebg.api.ApiRepository
import com.ersubhadip.removebg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initialization of the viewModel
        val repository = ApiRepository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory)[ViewModel::class.java]

        viewModel.getFinalImage(PostUrl("https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg"))



    }
}