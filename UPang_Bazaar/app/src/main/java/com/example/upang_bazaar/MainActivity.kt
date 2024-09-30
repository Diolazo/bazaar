package com.example.upang_bazaar

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.upang_bazaar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonLogin.setOnClickListener {
            //loginUser() easy click muna wala pang database
            startActivity(Intent(this, HomepageActivity::class.java))
        }

        binding.ForgotRedirect.setOnClickListener {
            //forget pass page
        }

        binding.signupbutton2.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

    }
}