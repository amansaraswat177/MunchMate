package com.example.munchmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.munchmate.databinding.ActivityPayOutBinding

class PayOutActivity : AppCompatActivity() {
    lateinit var binding : ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.placeMyOrderButton.setOnClickListener {
            val bottomSheetDialog = CongratsBottomSheet()
            bottomSheetDialog.show(supportFragmentManager,"test")
        }

    }
}