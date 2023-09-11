package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity


class AttivitaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.attivita_main)
        val intent = intent


        val passeggiatabtn = findViewById<TextView>(R.id.btnpasseggiata)
        val trekkingbtn = findViewById<TextView>(R.id.btntrekking)
        val ferratabtn = findViewById<TextView>(R.id.ferrata)



        passeggiatabtn.setOnClickListener{
            val intent: Intent = Intent(this, ProvinciaActivity::class.java)
            intent.putExtra("activity", "passeggiata")
            startActivity(intent)
        }

        trekkingbtn.setOnClickListener{
            val intent: Intent = Intent(this, ProvinciaActivity::class.java)
            intent.putExtra("activity", "trekking")
            startActivity(intent)
        }

        ferratabtn.setOnClickListener{
            val intent: Intent = Intent(this, ProvinciaActivity::class.java)
            intent.putExtra("activity", "ferrata")
            startActivity(intent)
        }



    }


}