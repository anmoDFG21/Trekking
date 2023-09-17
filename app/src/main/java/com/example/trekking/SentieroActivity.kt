package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView

class SentieroActivity : ComponentActivity() {
    private lateinit var textview: TextView
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        var trek:String = intent.getStringExtra("aa").toString()
        if(trek == "Rifugio Gnutti e la Via Terzulli")
            setContentView(R.layout.adamello_trek)
        if(trek == "Guglielmo da Zone")
            setContentView(R.layout.guglielmo_trek)
        if(trek == "Corna Trentapassi")
            setContentView(R.layout.trentapassi_treck)
        super.onCreate(savedInstanceState)

    }
}