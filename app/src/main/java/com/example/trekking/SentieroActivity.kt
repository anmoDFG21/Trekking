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
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adamello_trek)
        val sentiero = intent.getStringExtra("sentiero")

        textview = findViewById(R.id.text)
        imageView = findViewById(R.id.aa)

        // Creating a string that contains the information to be displayed
        val para = """Questa relazione descrive un'escursione verso la cima del Monte Guglielmo nelle Prealpi Bresciane, in Italia. Ecco un riassunto delle tappe principali dell'escursione:

Avvicinamento: 
L'escursione inizia da Brescia e si risale la Valle Camonica fino a Sonico, quindi si devia verso la Val Miller attraverso località Rino.
La strada diventa stretta e tortuosa nel bosco, passando dal Rifugio Val Malga.
Dopo il rifugio, la strada diventa stretta e senza parapetto su pendii devastati dalla tempesta Vaia.
Si arriva al Ponte del Guat, dove si può parcheggiare.
È possibile proseguire su una strada ciottolata e sterrata per circa 1 km fino allo spiazzo del Rifugio Premassone (a pagamento).

Descrizione:
Dal Ponte del Guat, si segue una strada in lieve salita fino alla Malga Premassone.
Dopo la malga, si prosegue su una ripida pista ciottolata fino alla Malga Frino.
Da qui, si inizia a seguire un sentiero che costeggia il torrente Remulo fino a raggiungere le Scale Miller, una serie di gradinate rocciose ripide.
Dopo le Scale Miller, si continua su terreno pianeggiante fino a raggiungere delle baite.
Si prosegue tra dossi erbosi e rocce montonate fino a raggiungere il Rifugio Gnutti a 2170 m di altitudine.
Dal rifugio, si segue il sentiero n.23 che costeggia la diga Miller.
Si attraversa il Pantano del Miller, una zona acquitrinosa, fino al Lago Naturale Miller.
Si segue il percorso che sale l'intero vallone fino a una conca erbosa alla base della ripida morena sul versante ovest della Punta Ugolini.
Si sale la morena, passando da terreno erboso a pietraia, fino a raggiungere la parete dove inizia la Via Terzulli.
Si indossa l'imbrago e si segue il percorso attrezzato con catene e passaggi rocciosi fino al Passo dell'Adamello a 3235 m di altitudine.
Si scende un pendio ripido di pietrame fino a una conca glaciale sotto il fronte del ghiacciaio.
Si attraversa il ghiacciaio e si prosegue sulla cresta fino alla cima dell'Adamello.
La cima è contrassegnata da una croce di vetta e una campana.
L'escursione offre una varietà di paesaggi, dalle ripide Scale Miller alle pietraie e ai passaggi rocciosi della Via Terzulli. 
È un'escursione impegnativa e richiede attrezzatura adeguata, compreso l'uso di catene e imbrago nella Via Terzulli, oltre a una 
buona conoscenza delle tecniche di arrampicata. La vista panoramica dalla cima dell'Adamello è la ricompensa finale per questa avventura in montagna."""

        // set value to the given TextView
        textview.text = para
        imageView.setImageResource(R.drawable.adamello)
        // to perform the movement action
        // Moves the cursor or scrolls to the
        // top or bottom of the document
        textview.movementMethod = ScrollingMovementMethod()
    }
}