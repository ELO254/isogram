package com.example.isogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var txtis:TextView
    private lateinit var edtis:EditText
    private lateinit var btnis: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtis = findViewById(R.id.txt_isogram)
        edtis = findViewById(R.id.edt_isogram)
        btnis = findViewById(R.id.btn_isogram)

        btnis.setOnClickListener {
            isogram()
        }
    }

    private fun isogram() {
        var list = mutableListOf<Any>()
        var set = mutableSetOf<Any>()
        var isogram = edtis.text.toString()

        for(char in isogram){
            list.add(char)
            set.add(char)
        }

        var sizel = list.size
        var sizes = set.size

        if(sizel > sizes){
            txtis.text = edtis.text.toString() + " is isogram"
        }else{
            txtis.text = edtis.text.toString() + " is not isogram"
        }


    }
}