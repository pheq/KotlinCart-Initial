package com.example.pierre.kotlincart_initial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        //ETAPE 4
        val nameTextView = findViewById(R.id.profil_nom) as TextView
        val prixTextView = findViewById(R.id.profil_prix) as TextView
        val imageView = findViewById(R.id.imageView) as ImageView

        val intent = intent
        val prix = intent.getIntExtra("prix", 0).toString()
        val name = intent.getStringExtra("name")
        val type = intent.getStringExtra("type")

        prixTextView.text = "${prix} €"
        nameTextView.text = getNameBySmartCast(name)


        imageView.setImageResource(getImageOfType(Type.valueOf(type)))
    }

    //ETAPE 5
    fun getImageOfType(type: Type): Int{
        when (type){
            Type.Livre -> return R.drawable.livres
            Type.Dvd -> return R.drawable.dvd_img
        }
    }

    //ETAPE 6
    fun getNameBySmartCast(name: Any): String{
        if(name is String){
            return name
        }
        return "nothing"
    }


}
