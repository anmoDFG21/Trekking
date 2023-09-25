package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView

class MapsActivity : ComponentActivity() {
    private lateinit var textview: TextView
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.trentapassi_treck)
        super.onCreate(savedInstanceState)

    }
}