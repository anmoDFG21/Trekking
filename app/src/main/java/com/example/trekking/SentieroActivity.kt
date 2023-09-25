package com.example.trekking

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.ImageView
import android.view.MotionEvent
import android.view.ScaleGestureDetector


lateinit var image_: ImageView
lateinit var scale: ScaleGestureDetector
var factor_f:Float = 0F
var x_f:Float = 0F
var y_f:Float = 0F
var dx_f:Float = 0F
var dy_f:Float = 0F

class SentieroActivity : ComponentActivity() {
    private lateinit var textview: TextView
    private lateinit var imageView: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        var trek:String = intent.getStringExtra("aa").toString()
        if(trek == "Rifugio Gnutti e la Via Terzulli")
            setContentView(R.layout.aamaps)
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
        super.onCreate(savedInstanceState)
        image_ = findViewById(R.id.aamaps)
        scale = ScaleGestureDetector(this,ScaleListener())

    }

    public override fun onTouchEvent(event: MotionEvent): Boolean
    {
        if(event.action == MotionEvent.ACTION_DOWN)
        {
            x_f = event.getX()
            y_f = event.getY()
        }

        if(event.action == MotionEvent.ACTION_MOVE)
        {
            dx_f = event.getX() - x_f
            dy_f = event.getY() - y_f

            image_.x = image_.x + dx_f
            image_.y = image_.y + dy_f

            x_f = event.getX()
            y_f = event.getY()

        }
        scale.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    public class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener()
    {
        public override fun onScale(gest:ScaleGestureDetector): Boolean
        {
            factor_f += (gest.scaleFactor-1)
            image_.scaleX = factor_f
            image_.scaleY = factor_f
            return true
        }

        public override fun onScaleBegin(gest:ScaleGestureDetector): Boolean
        {
            return true
        }

    }
}