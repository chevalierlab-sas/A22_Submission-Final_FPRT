package com.panjidwisatrio.noyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        object : Thread() {
            override fun run() {
                try {
                    sleep(3000)
                    startActivity(Intent(baseContext, MainActivity::class.java))
                    finish()
                } catch (e : Exception) {
                    Log.d("splash screen", e.message.toString())
                }
            }
        }.start()
    }
}