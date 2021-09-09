package com.example.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun go(v:View){
        val i = Intent(this, SecondActivity::class.java)
        val r = Random.nextInt(100, 200)
        i.putExtra("message", "dinner tonight $r")
        i.putExtra("luckyNumber", r)
        startActivity(i)
    }

}