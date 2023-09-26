package com.example.trekking

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import android.widget.ImageView
import android.view.MotionEvent
import android.view.ScaleGestureDetector


lateinit var Image_view: ImageView
lateinit var Scale_class: ScaleGestureDetector
var Factor_f:Float = 0F
var X_f:Float = 0F
var Y_f:Float = 0F
var Dx_f:Float = 0F
var Dy_f:Float = 0F
val MaxZoom_f:Float = 4F
val MinZoom_f:Float = 1.5F
var FirstTime_b:Boolean = false
var X0_f:Float = 0F
var Y0_f:Float = 0F
var Treshhold:Float = 20F

val XMax_f:Float = 700F
val YMax_f:Float = 1000F


class SentieroActivity : ComponentActivity() {

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
        Image_view = findViewById(R.id.aamaps)
        Scale_class = ScaleGestureDetector(this,ScaleListener())

    }

    public override fun onTouchEvent(event: MotionEvent): Boolean
    {
        if(event.action == MotionEvent.ACTION_DOWN)
        {
            X_f = event.getX()
            Y_f = event.getY()
        }

        if(event.action == MotionEvent.ACTION_MOVE)
        {
            if(FirstTime_b == false)
            {
                X0_f = Image_view.x
                Y0_f = Image_view.y
                FirstTime_b = true
            }
            Dx_f = event.getX() - X_f
            Dy_f = event.getY() - Y_f

            Image_view.x = (Image_view.x + Dx_f*0.7).toFloat()
            Image_view.y = (Image_view.y + Dy_f*0.7).toFloat()

            if(Image_view.x > XMax_f || Image_view.x < -XMax_f )
            {
                if(Image_view.x > 0)
                {
                    Image_view.x = XMax_f-Treshhold
                }
                else
                {
                    Image_view.x = -XMax_f+Treshhold

                }
            }
            if(Image_view.y > YMax_f || Image_view.y < -YMax_f)
            {
                if(Image_view.y > 0)
                {
                    Image_view.y = YMax_f-Treshhold
                }
                else
                {
                    Image_view.y = -YMax_f+Treshhold
                }
            }
            X_f = event.getX()
            Y_f = event.getY()

            Log.d("x =", "Value: " + Image_view.y);
        }
        Scale_class.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    public class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener()
    {
        public override fun onScale(gest:ScaleGestureDetector): Boolean
        {
            Factor_f += (gest.scaleFactor-1)
            if(Factor_f > MaxZoom_f)
                Factor_f = MaxZoom_f
            if(Factor_f < MinZoom_f)
                Factor_f = MinZoom_f
            Image_view.scaleX = Factor_f
            Image_view.scaleY = Factor_f
            return true
        }

        public override fun onScaleBegin(gest:ScaleGestureDetector): Boolean
        {
            return true
        }

    }
}