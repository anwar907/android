package com.lumbunginovasi.sika

import android.content.Context
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        text = findViewById(R.id.txtKia) as TextView
        val kia = Typeface.createFromAsset(assets, "font/quicksand/Quicksand-Bold.otf")
        text.typeface = kia

        text = findViewById(R.id.txtKiaPanjang) as TextView
        val kiaPanjang = Typeface.createFromAsset(assets, "font/quicksand/Quicksand-Bold.otf")
        text.typeface = kiaPanjang

        text = findViewById(R.id.etxUsername) as TextView
        val username = Typeface.createFromAsset(assets, "font/quicksand/Quicksand-Bold.otf")
        text.typeface = username

        text = findViewById(R.id.etxPassword) as TextView
        val password= Typeface.createFromAsset(assets, "font/quicksand/Quicksand-Bold.otf")
        text.typeface = password

        text = findViewById(R.id.btnLogin) as TextView
        val login = Typeface.createFromAsset(assets, "font/quicksand/Quicksand-Bold.otf")
        text.typeface = login


    }


}
