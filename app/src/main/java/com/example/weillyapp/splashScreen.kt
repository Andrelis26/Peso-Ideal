package com.example.weillyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)
        Timer().schedule(object : TimerTask(){

            override fun run() {
                val intent = Intent (this@splashScreen, MainActivity :: class.java)
                startActivity(intent)
                finish()
            }

        },1700L )
    }
}
