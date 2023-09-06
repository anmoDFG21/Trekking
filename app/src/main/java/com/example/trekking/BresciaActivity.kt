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
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/"))
                newArrayList.add(Montagna(R.drawable.resegone,"Resegone da Lecco","3 h ","Lecco",
                    "https://www.trekkinglecco.com/resegone-piazzale-funivia-lecco-sentiero-1/"))
                newArrayList.add(Montagna(R.drawable.pizzococa,"Pizzo Coca ","10 h ","Valbondione",
                    "https://www.maxpiantoni.it/foto-sui-sentieri-orobici/escursione-al-pizzo-coca.html "))
                newArrayList.add(Montagna(R.drawable.pizzoarera,"Pizzo Arera ","7 h ","Zambla alta ",
                    "https://www.valbrembanaweb.com/valbrembanaweb/monti/arera.html "))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ "))
                newArrayList.add(Montagna(R.drawable.laghigemelli,"Laghi gemelli ","5 h ","Carona",
                    "https://lemontagne.net/laghi-gemelli/ "))
                newArrayList.add(Montagna(R.drawable.pizzobecco,"Ferrata pizzo del becco ","2 h ","Rif laghi gemelli ",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-pizzo-becco/#foto "))
                newArrayList.add(Montagna(R.drawable.pizzocamino,"Pizzo camino normale ","6.5 h ","Schilpario",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=713 "))
            }

            "trekking" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Via trekking e Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/"))
                newArrayList.add(Montagna(R.drawable.resegone,"Resegone da Lecco","3 h ","Lecco",
                    "https://www.trekkinglecco.com/resegone-piazzale-funivia-lecco-sentiero-1/"))
                newArrayList.add(Montagna(R.drawable.pizzococa,"Pizzo Coca ","10 h ","Valbondione",
                    "https://www.maxpiantoni.it/foto-sui-sentieri-orobici/escursione-al-pizzo-coca.html "))
                newArrayList.add(Montagna(R.drawable.pizzoarera,"Pizzo Arera ","7 h ","Zambla alta ",
                    "https://www.valbrembanaweb.com/valbrembanaweb/monti/arera.html "))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ "))
                newArrayList.add(Montagna(R.drawable.laghigemelli,"Laghi gemelli ","5 h ","Carona",
                    "https://lemontagne.net/laghi-gemelli/ "))
                newArrayList.add(Montagna(R.drawable.pizzobecco,"Ferrata pizzo del becco ","2 h ","Rif laghi gemelli ",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-pizzo-becco/#foto "))
                newArrayList.add(Montagna(R.drawable.pizzocamino,"Pizzo camino normale ","6.5 h ","Schilpario",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=713 "))
            }

            "ferrata" ->
            {
                newArrayList.add(Montagna(R.drawable.adamello,"Via ferrata e Terzulli","11 h ","Val d'Avio",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-terzulli-adamello/"))
                newArrayList.add(Montagna(R.drawable.guglielmo,"Guglielmo da Zone","3.45 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-al-monte-guglielmo/"))
                newArrayList.add(Montagna(R.drawable.resegone,"Resegone da Lecco","3 h ","Lecco",
                    "https://www.trekkinglecco.com/resegone-piazzale-funivia-lecco-sentiero-1/"))
                newArrayList.add(Montagna(R.drawable.pizzococa,"Pizzo Coca ","10 h ","Valbondione",
                    "https://www.maxpiantoni.it/foto-sui-sentieri-orobici/escursione-al-pizzo-coca.html "))
                newArrayList.add(Montagna(R.drawable.pizzoarera,"Pizzo Arera ","7 h ","Zambla alta ",
                    "https://www.valbrembanaweb.com/valbrembanaweb/monti/arera.html "))
                newArrayList.add(Montagna(R.drawable.cornatrentapassi,"Corna Trentapassi ","1.5 h ","Zone",
                    "https://visitlakeiseo.info/sport-e-natura/trekking-da-zone-alla-corna-trentapassi/ "))
                newArrayList.add(Montagna(R.drawable.laghigemelli,"Laghi gemelli ","5 h ","Carona",
                    "https://lemontagne.net/laghi-gemelli/ "))
                newArrayList.add(Montagna(R.drawable.pizzobecco,"Ferrata pizzo del becco ","2 h ","Rif laghi gemelli ",
                    "https://www.ferrate365.it/vie-ferrate/ferrata-pizzo-becco/#foto "))
                newArrayList.add(Montagna(R.drawable.pizzocamino,"Pizzo camino normale ","6.5 h ","Schilpario",
                    "https://www.vienormali.it/montagna/cima_scheda.asp?cod=713 "))
            }
        }



        val adapter = MyAdapter(newArrayList)
        newRecylerview.adapter = adapter
        adapter.onItemClickListener(object : MyAdapter.onItemClickListener
        {
            override fun onItemClick(position: Int)
            {
                gotoUrl(newArrayList[position].Link)
            }
        })

    }
}

