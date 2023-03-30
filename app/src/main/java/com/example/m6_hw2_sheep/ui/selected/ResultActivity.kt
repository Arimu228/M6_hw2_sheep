package com.example.m6_hw2_sheep.ui.selected

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m6_hw2_sheep.R
import com.example.m6_hw2_sheep.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private val adapter = ResultAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        initListener()
    }
    private fun initView() {
        binding.rvSelectedImage.adapter = adapter
    }
    private fun initListener() {
        val uri = intent.getSerializableExtra(getString(R.string.data_image))
        if (uri != null) {
            adapter.addImage(uri as ArrayList<Uri>)
        }
    }


}