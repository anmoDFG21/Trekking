package com.example.trekking

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.ImageView
import android.view.MotionEvent
import android.view.ScaleGestureDetector





class SentieroActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var trek:String = intent.getStringExtra("aa").toString()
        if(trek == "Rifugio Gnutti e \n la Via Terzulli")
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
        else if(trek == "Gruppo del Tredenus")
            setContentView(R.layout.gruppotredenus)
        else if(trek == "Il selvaggio\n" +"Passo Dernal")
            setContentView(R.layout.passodernal)
        else if(trek == "Cornone di Blumone")
            setContentView(R.layout.cornoneblumone)
        else if(trek == "Passo Crocedomini")
            setContentView(R.layout.passocrocedomini)
        else if(trek == "Monte Cimosco")
            setContentView(R.layout.montecimoso)
        else if(trek == "Rifugio Val Trompia")
            setContentView(R.layout.rifugiovaltrompia)
        else if(trek == "Rifugio Nasego")
            setContentView(R.layout.rifugionasego)
        else if(trek == "Monte Pizzocolo")
            setContentView(R.layout.montepizzocolo)
        else if(trek == "Altopiano di Cariadeghe")
            setContentView(R.layout.altopianocariadeghe)
        else if(trek == "Monte Maddalena")
            setContentView(R.layout.maddalena)
        else if(trek == "Sentiero dei Fiori")
            setContentView(R.layout.sentierofiori_trek)
        else
            setContentView(R.layout.aamaps)

        setContentView(R.layout.adamello_trek)
        super.onCreate(savedInstanceState)

        val passeggiatabtn = findViewById<TextView>(R.id.mappa_btn)


        passeggiatabtn.setOnClickListener{
            val intent: Intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("sentiero", trek)
            startActivity(intent)
        }


    }


}