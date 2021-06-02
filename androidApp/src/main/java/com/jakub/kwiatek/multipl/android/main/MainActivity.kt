package com.jakub.kwiatek.multipl.android.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakub.kwiatek.multipl.Greeting
import android.widget.TextView
import com.jakub.kwiatek.multipl.android.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
