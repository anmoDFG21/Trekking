package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity


class ProvinciaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.provincia_main)
        val activity = intent.getStringExtra("activity")


        val bergamobtn = findViewById<TextView>(R.id.bergamo)

        bergamobtn.setOnClickListener{
            val intent: Intent = Intent(this, BresciaActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "brescia")
            startActivity(intent)
        }






    }


}