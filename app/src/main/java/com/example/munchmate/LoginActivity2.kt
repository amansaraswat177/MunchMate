package com.example.munchmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.munchmate.databinding.ActivityLogin2Binding

class LoginActivity2 : AppCompatActivity() {
    private val binding:ActivityLogin2Binding by lazy {
        ActivityLogin2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.loginbtn.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
        binding.donthavebtn.setOnClickListener{
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
        }
    }
}