package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text


class ProvinciaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.provincia_main)

        val bergamobtn = findViewById<TextView>(R.id.bergamo)
        val bresciabtn = findViewById<TextView>(R.id.brescia)
        val comobtn = findViewById<TextView>(R.id.como)
        val leccobtn = findViewById<TextView>(R.id.lecco)
        val sondriobtn = findViewById<TextView>(R.id.sondrio)

        bergamobtn.setOnClickListener{
            startActivity(Intent(this,BergamoActivity::class.java))
        }
        bresciabtn.setOnClickListener{
            startActivity(Intent(this,BresciaActivity::class.java))
        }
        comobtn.setOnClickListener{
            startActivity(Intent(this,ComoActivity::class.java))
        }
        leccobtn.setOnClickListener{
            startActivity(Intent(this,LeccoActivity::class.java))
        }
        sondriobtn.setOnClickListener{
            startActivity(Intent(this,SondrioActivity::class.java))
        }

    }


}