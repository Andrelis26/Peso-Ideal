package com.example.weillyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_woman.*

class activity_woman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_woman)

        btncalcular.setOnClickListener{

            var edad : String = editEdad.text.toString()
            var altura : String = EditAltura.text.toString()
            val cons : Int = 100;
            val const : Double = 0.9;

            var edadInt : Int = edad.toInt()
            var alturaInt : Int = altura.toInt()


            var resultado : Double =  alturaInt - cons +((edadInt/10)*const)
            TextResult.text = " Tu peso ideal es de " + resultado.toString() + "kg " +
                    " \n Haz ejercicio, come bien y se paciente."

            editEdad.setText("")
            EditAltura.setText("")


        }

        home.setOnClickListener {
            val intent : Intent = Intent( this, MainActivity::class.java )
            startActivity(intent)
            this.finish()
        }
    }


}
