package com.example.myapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getting reference
        val btn_clicked = findViewById(R.id.btn_click) as Button
        var times = 0
        val text = findViewById(R.id.tv_number) as TextView


        //onclicklistener
        btn_clicked.setOnClickListener {
            times++
            text.text = times.toString()
            if(times > 100) {
                text.text = "Too Big !!!!!"
            }
            Toast.makeText(this@MainActivity, "Button Clicked!!!", Toast.LENGTH_LONG)
        }
    }
}