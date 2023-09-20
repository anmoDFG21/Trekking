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
        else if(trek == "Guglielmo da Zone")
            setContentView(R.layout.guglielmo_trek)
        else if(trek == "Corna Trentapassi")
            setContentView(R.layout.trentapassi_treck)
        else if(trek == "Cima Laione ")
            setContentView(R.layout.laione_trek)
        else if(trek == "Lago della Vacca ")
            setContentView(R.layout.lagovacca_trek)
        else if(trek == "Rifugio Maria e \n Franco")
            setContentView(R.layout.mariafranco_trek)
        else if(trek == "Monte Vignole")
            setContentView(R.layout.vignole_trek)
        else if(trek == "Lago di Lova")
            setContentView(R.layout.lova_trek)
        else if(trek == "Punta Almana")
            setContentView(R.layout.almana_trek)
        else if(trek == "Monte Torsoleto")
            setContentView(R.layout.montetorsoleto_trek)
        else if(trek == "Altopiano del Mortirolo")
            setContentView(R.layout.mortirolo_trek)
        else if(trek == "Pizzo Camino Camuno")
            setContentView(R.layout.pizzocamuno_trek)
        else if(trek == "Sentiero delle Aquile")
            setContentView(R.layout.sentieroaquile_trel)
        else if(trek == "Valli di S. Antonio")
            setContentView(R.layout.valliantonio_trek)
        else if(trek == "Val Miller")
            setContentView(R.layout.valmiller)
        else if(trek == "Val Salarno")
            setContentView(R.layout.valsalarno)
        else
            setContentView(R.layout.trentapassi_treck)





        super.onCreate(savedInstanceState)

    }
}