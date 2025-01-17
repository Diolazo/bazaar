package com.example.upang_bazaar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.upang_bazaar.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonLoginPage.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.ButtonSignup.setOnClickListener {
            //RegisterUser()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
