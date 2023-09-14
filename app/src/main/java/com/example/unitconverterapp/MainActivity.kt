package com.example.unitconverterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn :Button = findViewById(R.id.button)
        val enterKilos :EditText = findViewById(R.id.edit_text)
        val result :TextView = findViewById(R.id.resultText)

     btn.setOnClickListener(){
       val killos =enterKilos.text.toString().toDouble()
         result.text = ""+ convertToMillimetres(killos)
     }
    }

    private fun convertToMillimetres(killos: Double): Double {
        return killos * 1000000

    }
}