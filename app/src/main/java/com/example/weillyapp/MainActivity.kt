package com.example.weillyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnWoman.setOnClickListener {
    val intentWoman : Intent = Intent( this, activity_woman::class.java )
    startActivity(intentWoman)
}
    btnMan.setOnClickListener{
    val intentMan : Intent = Intent  (this, Man:: class.java)
        startActivity(intentMan)
}

    }


}
