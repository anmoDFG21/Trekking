package com.example.trekking

import android.os.Bundle
import android.os.Handler
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
val MaxZoom_f:Float = 5F
val MinZoom_f:Float = 1.5F
var FirstTime_b:Boolean = false
var X0_f:Float = 0F
var Y0_f:Float = 0F
var Treshhold:Float = 20F

val XMax_f:Float = 900F
val YMax_f:Float = 1200F


class MapsActivity : ComponentActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        setContentView(R.layout.aamaps)
        super.onCreate(savedInstanceState)
        Image_view = findViewById(R.id.aamaps)
        Scale_class = ScaleGestureDetector(this,ScaleListener())



        var trek:String = intent.getStringExtra("sentiero").toString()

        if(trek == "Rifugio Gnutti e \n la Via Terzulli")
            Image_view.setImageResource(R.drawable.adamello_map)
        else if(trek == "Guglielmo da Zone")
            Image_view.setImageResource(R.drawable.guglielmo_map)
        else if(trek == "Corna Trentapassi")
            Image_view.setImageResource(R.drawable.tremtapassi_map)
        else if(trek == "Cima Laione ")
            Image_view.setImageResource(R.drawable.laione_map)
        else if(trek == "Lago della Vacca ")
            Image_view.setImageResource(R.drawable.lagovacca_map)
        else if(trek == "Rifugio Maria e \n Franco")
            Image_view.setImageResource(R.drawable.rifugio_mariaefranco_map)
        else if(trek == "Monte Vignole")
            Image_view.setImageResource(R.drawable.vignole_map)
        else if(trek == "Lago di Lova")
            Image_view.setImageResource(R.drawable.lova_map)
        else if(trek == "Punta Almana")
            Image_view.setImageResource(R.drawable.almana_map)
        else if(trek == "Monte Torsoleto")
            Image_view.setImageResource(R.drawable.torsoleto_map)
        else if(trek == "Altopiano del Mortirolo")
            Image_view.setImageResource(R.drawable.mortirolo_map)
        else if(trek == "Pizzo Camino Camuno")
            Image_view.setImageResource(R.drawable.camuno_map)
        else if(trek == "Valli di S. Antonio")
            Image_view.setImageResource(R.drawable.valliantonio)
        else if(trek == "Val Miller")
            Image_view.setImageResource(R.drawable.adamello_map)
        else if(trek == "Val Salarno")
            Image_view.setImageResource(R.drawable.salarno_map)
        else if(trek == "Gruppo del Tredenus")
            Image_view.setImageResource(R.drawable.tredenus_map)
        else if(trek == "Il selvaggio\n" +"Passo Dernal")
            Image_view.setImageResource(R.drawable.dernal_map)
        else if(trek == "Cornone di Blumone")
           Image_view.setImageResource(R.drawable.blumone_map)
        else if(trek == "Passo Crocedomini")
            Image_view.setImageResource(R.drawable.crocedomini_map)
        else if(trek == "Monte Cimosco")
            Image_view.setImageResource(R.drawable.cimoso_map)
        else if(trek == "Rifugio Val Trompia")
            Image_view.setImageResource(R.drawable.valtrompia_map)
        else if(trek == "Rifugio Nasego")
            Image_view.setImageResource(R.drawable.rifugio_nasego_map)
        else if(trek == "Monte Pizzocolo")
            Image_view.setImageResource(R.drawable.pizzocolo_map)
        else if(trek == "Altopiano di Cariadeghe")
            Image_view.setImageResource(R.drawable.cariadeghe_map)
        else if(trek == "Monte Maddalena")
            Image_view.setImageResource(R.drawable.maddalena_map)
        else if(trek == "Sentiero dei Fiori")
            Image_view.setImageResource(R.drawable.fiori_map)
        else
            Image_view.setImageResource(R.drawable.fiori_map)

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