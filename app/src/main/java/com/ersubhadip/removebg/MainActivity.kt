package com.ersubhadip.removebg

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ersubhadip.removebg.Models.PostUrl
import com.ersubhadip.removebg.ViewModel.ViewModel
import com.ersubhadip.removebg.ViewModel.ViewModelFactory
import com.ersubhadip.removebg.api.ApiRepository
import com.ersubhadip.removebg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel
    lateinit var binding: ActivityMainBinding

    private val startForImagePicker =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            val resultCode = result.resultCode
            val data = result.data

            if (resultCode == Activity.RESULT_OK) {
                // Use this image URI to upload this image
                val fileUri = data?.data

                Log.i("RegistrationActivity", "Image URL = $fileUri")
                Toast.makeText(this, "Successfully got the image from gallery", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Error while getting the photo from gallery", Toast.LENGTH_SHORT).show()
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //initialization of the viewModel
        val repository = ApiRepository()
        val viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory)[ViewModel::class.java]

        viewModel.getFinalImage(PostUrl("https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg"))

        binding.uploadBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startForImagePicker.launch(intent)
        }


    }
}