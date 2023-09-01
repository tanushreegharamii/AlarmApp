package com.example.setalarm

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val alarmanim = findViewById<LottieAnimationView>(R.id.alarmanim)

        alarmanim.alpha = 0f
       alarmanim.animate().setDuration(4000).alpha(1f).withEndAction{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
           finish()
        }

    }
}