package com.example.trekking


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList



class ComoActivity : ComponentActivity()
{
    private lateinit var newRecylerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Montagna>
    private lateinit var link : Array<String>

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        act = intent.getStringExtra("activity").toString()
        citta = intent.getStringExtra("citta").toString()

        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)
        newArrayList = arrayListOf<Montagna>()
        getUserdata()

    }
    private fun gotoUrl(s:String)
    {
        startActivity( Intent(Intent.ACTION_VIEW, Uri.parse(s)))
    }

    private fun getUserdata()
    {
        when(act)
        {

            "passeggiata" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Via passeggiata e Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/","passeggiata"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/","passeggiata"))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ ","passeggiata"))


            }

            "trekking" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Via passeggiata e Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/","trekking"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/","trekking"))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ ","trekking"))
                newArrayList.add(Montagna(R.drawable.cimalaione,"Cima Laione ","7 h ","Bazena",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=3327","trekking"))
                newArrayList.add(Montagna(R.drawable.cimalaione,"Cima Laione ","7 h ","Bazena",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=3327","trekking"))

                //newArrayList.add(Montagna(R.drawable.," "," ","", ""))
                newArrayList.add(Montagna(R.drawable.lagodellavacca,"Lago della Vacca ","2.5 h ","Cadino della Banca",
                    "https://www.vivilavalsabbia.com/escursione-al-lago-della-vacca-mt-2350-valle-del-caffaro/","trekking"))
                newArrayList.add(Montagna(R.drawable.rifugiomariafranco,"rifugio Maria e \n Franco","4.5h ","Case di Val Paghera",
                    "https://www.rifugi.lombardia.it/attivita/trekking/al-rifugio-piu-alto-della-val-camonica.html","trekking"))
                newArrayList.add(Montagna(R.drawable.montevignole,"Monte Vignole","2h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-vignole/","trekking"))
                newArrayList.add(Montagna(R.drawable.lagolova,"Lago di Lova","2 h ","Località Navertino",
                    "https://www.stradecinofile.it/al-lago-di-lova-in-val-camonica-con-il-cane/","trekking"))
                newArrayList.add(Montagna(R.drawable.puntaalmana,"Punta Almana","4h ","Croce di Marone",
                    "https://www.rifugi.lombardia.it/attivita/trekking/punta-almana.html","trekking"))



            }

            "ferrata" ->
            {
                //newArrayList.add(Montagna(R.drawable.," "," ","", ""))
                newArrayList.add(Montagna(R.drawable.sentierodeifiori,"Sentiero dei fiori","7 h ","Passo paradiso",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-sentiero-fiori-tonale-adamello/","ferrata"))
                newArrayList.add(Montagna(R.drawable.ferratacapre,"Ferrata delle capre","3 h ","Croce di Marone",
                    "https://www.vieferrate.it/pag-relazioni/lombardia/54-prealpi-bresciane/425-corna-delle-capre.html","ferrata"))
                newArrayList.add(Montagna(R.drawable.ferratadelbene,"Ferrata del bene","4.5 h ","Zone",
                    "https://www.vieferrate.it/pag-relazioni/lombardia/54-prealpi-bresciane/404-corno-del-bene.html","ferrata"))

                //sentiero dei fiori
                // ferrata delle capre
                //ferrata del bene
                //ferrta fregio e ginestre
                //grevo rifugio lissone
                //punta dal violo
                //sassi lado d'idro
            }
        }
    }
}

