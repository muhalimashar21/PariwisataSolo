package com.example.pariwisatasolo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pariwisatasolo.MainActivity
import com.example.pariwisatasolo.R
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Timer("splashDisapper",true).schedule(2000){
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}
