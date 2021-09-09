package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val extras = intent.extras?:return
        val message = extras.getString("message")
        val luckyNumber = extras.getInt("luckyNumber")
        val messageTV = findViewById<TextView>(R.id.messageTV)
        Log.i("SecondActivity", message!!)
        Log.i("luckyNumber", luckyNumber.toString())
        messageTV.text = "$message"
    }
}