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


        val bresciabtn = findViewById<TextView>(R.id.brescia)
        val comobtn = findViewById<TextView>(R.id.como)
        val leccobtn = findViewById<TextView>(R.id.lecco)
        val sondriobtn = findViewById<TextView>(R.id.sondrio)
        val bergamobtn = findViewById<TextView>(R.id.bergamo)

        bergamobtn.setOnClickListener{
            val intent: Intent = Intent(this, BresciaActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "brescia")
            startActivity(intent)
        }

        bresciabtn.setOnClickListener{
            val intent: Intent = Intent(this, BresciaActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "brescia")
            startActivity(intent)
        }

        comobtn.setOnClickListener{
            val intent: Intent = Intent(this, ComoActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "lecco")
            startActivity(intent)
        }

        leccobtn.setOnClickListener{
            val intent: Intent = Intent(this, LeccoActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "como")
            startActivity(intent)
        }

        sondriobtn.setOnClickListener{
            val intent: Intent = Intent(this, SondrioActivity::class.java)
            intent.putExtra("activity", activity)
            intent.putExtra("citta", "sondrio")
            startActivity(intent)
        }


    }


}