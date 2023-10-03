package com.example.trekking


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

var act = "gg"
var citta = "guhzedhgu"

class BresciaActivity : ComponentActivity()
{
    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Montagna>


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        act = intent.getStringExtra("activity").toString()


        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)
        newArrayList = arrayListOf()
        getUserdata()

    }

    fun gotoUrl(s:String)
    {
        val intent: Intent = Intent(this, SentieroActivity::class.java)
        intent.putExtra("aa", s)
        startActivity(intent)
        //startActivity( Intent(Intent.ACTION_VIEW, Uri.parse(s)))
    }

    private fun getUserdata()
    {
        when(act)
        {
            "passeggiata" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Via passeggiata e Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/"))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ "))
            }

            "trekking" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Rifugio Gnutti e \n la Via Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/"))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ "))
                newArrayList.add(Montagna(R.drawable.cimalaione,"Cima Laione ","7 h ","Bazena",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=3327"))
                newArrayList.add(Montagna(R.drawable.lagodellavacca,"Lago della Vacca ","2.5 h ","Bazena",
                    "https://www.vivilavalsabbia.com/escursione-al-lago-della-vacca-mt-2350-valle-del-caffaro/"))
                newArrayList.add(Montagna(R.drawable.rifugiomariafranco,"Rifugio Maria e \n Franco","4.5h ","Case di \n Val Paghera",
                    "https://www.rifugi.lombardia.it/attivita/trekking/al-rifugio-piu-alto-della-val-camonica.html"))
                newArrayList.add(Montagna(R.drawable.montevignole,"Monte Vignole","2h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-vignole/"))
                newArrayList.add(Montagna(R.drawable.lagolova,"Lago di Lova","4.45 h ","Borno",
                    "https://www.stradecinofile.it/al-lago-di-lova-in-val-camonica-con-il-cane/"))
                newArrayList.add(Montagna(R.drawable.puntaalmana,"Punta Almana","4h ","Croce di Marone",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.pizzocamino1,"Pizzo Camino Camuno","3 h","Lago di Lova",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))
                newArrayList.add(Montagna(R.drawable.montetorsoleto,"Monte Torsoleto","3.5 h","Loveno",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.valliantonio,"Valli di S. Antonio","4.5 h","S. Antonio",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.mortirolo,"Altopiano del Mortirolo","3 h","Rifugio Antonioli",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                //newArrayList.add(Montagna(R.drawable.aquile,"Sentiero delle Aquile","3.5 h","Pozzuolo",
                //    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.valmiller,"Val Miller","2.5 h","Ponte del Guat",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.valsalarno,"Val Salarno","3.5 h","Rifugio Fabrezza",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))
                newArrayList.add(Montagna(R.drawable.gruppotredenus,"Gruppo del Tredenus","4 h","Rifugio Colombè",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.passodernal,"Il selvaggio\n" + "Passo Dernal","3 h","Val Daone",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.cornoneblumone,"Cornone di Blumone","3 h","Bazena",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.passocrocedomini,"Passo Crocedomini"," ","Passo di\n" + "Crocedomini",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.montecimoso,"Monte Cimosco","2 h","Plan di Monte\n" +
                        "Campione",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.rifugiovaltrompia,"Rifugio Val Trompia","1.2 h","Pezzoro",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.rifugionasego,"Rifugio Nasego","0.5 h","Lodrino",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.montepizzocolo,"Monte Pizzocolo","1.5 h","Passo di Spino",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.cariadeghe,"Altopiano di Cariadeghe","1.5 h","Villa",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.maddalena,"Monte Maddalena","0.5-3h","Maddalena",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))

                newArrayList.add(Montagna(R.drawable.sentierodeifiori,"Sentiero dei Fiori","10 h","Passo\n" +
                        "del Paradiso",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html"))
            }

            "ferrata" ->
            {
                //newArrayList.add(Montagna(R.drawable.," "," ","", ""))
                newArrayList.add(Montagna(R.drawable.sentierodeifiori,"Sentiero dei fiori","7 h ","Passo paradiso",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-sentiero-fiori-tonale-adamello/"))
                newArrayList.add(Montagna(R.drawable.ferratacapre,"Ferrata delle capre","3 h ","Croce di Marone",
                    "https://www.vieferrate.it/pag-relazioni/lombardia/54-prealpi-bresciane/425-corna-delle-capre.html"))
                newArrayList.add(Montagna(R.drawable.ferratadelbene,"Ferrata del bene","4.5 h ","Zone",
                    "https://www.vieferrate.it/pag-relazioni/lombardia/54-prealpi-bresciane/404-corno-del-bene.html"))

                //sentiero dei fiori
                // ferrata delle capre
                //ferrata del bene
                //ferrta fregio e ginestre
                //grevo rifugio lissone
                //punta dal violo
                //sassi lado d'idro
            }
        }



        val adapter = MyAdapter(newArrayList)
        newRecylerview.adapter = adapter
        adapter.onItemClickListener(object : MyAdapter.onItemClickListener
        {
            override fun onItemClick(position: Int)
            {
                gotoUrl(newArrayList[position].Sentiero)
            }
        })

    }
}

