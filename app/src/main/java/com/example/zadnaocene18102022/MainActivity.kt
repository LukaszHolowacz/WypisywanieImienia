package com.example.zadnaocene18102022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wynik = findViewById<TextView>(R.id.wynik)
        val butdokleja = findViewById<Button>(R.id.doklejatext)
        val butreset = findViewById<Button>(R.id.mojeimie)
        val podanytext = findViewById<EditText>(R.id.editTextTextPersonName)

        butdokleja.setOnClickListener {
            wynik.text = wynik.text.toString() + podanytext.text.toString()
        }

        butreset.setOnClickListener {
            wynik.setText(R.string.my_name)
        }
    }
}