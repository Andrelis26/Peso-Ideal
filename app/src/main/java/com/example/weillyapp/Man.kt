package com.example.weillyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_man.*
import kotlinx.android.synthetic.main.activity_woman.*

class Man : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man)


       btnCalculate.setOnClickListener{
           var AgeMan : String = editAge.text.toString()
           var HigthMan : String =  EditHigth.text.toString()

           val cons : Int = 100;
           val const : Double = 0.9;

           var AgeInt : Int = AgeMan.toInt()
           var HightInt : Int = HigthMan.toInt()
           var result : Double =  HightInt - cons +((AgeInt/10)*const)
           var resultF : String = result.toString()

           resultT.text = " Tu peso ideal es de " + resultF + " kg " +
                    " \n Cuida tu cuerpo. Es el unico lugar en el que tienes que vivir."
           editAge.setText("")
           EditHigth.setText("")
        }

        home1.setOnClickListener {
            val intent : Intent = Intent( this, MainActivity::class.java )
            startActivity(intent)
            this.finish()

        }
    }
}
