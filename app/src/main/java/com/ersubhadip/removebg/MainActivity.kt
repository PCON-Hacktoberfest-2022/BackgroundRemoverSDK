package com.ersubhadip.removebg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
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
        viewModel = ViewModelProvider(this,viewModelFactory).get(ViewModel::class.java)




    }
}