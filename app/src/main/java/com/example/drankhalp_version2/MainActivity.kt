package com.example.drankhalp_version2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTacos.setOnClickListener {
            val intentGoToTacosPage = Intent(this, Activity_Tacos_Page::class.java)
            startActivity(intentGoToTacosPage)
        }

        buttonAsian.setOnClickListener {
            val intentGoToAsianPage = Intent(this, Activity_Asian_Page::class.java)
            startActivity(intentGoToAsianPage)
        }

        buttonBurgers.setOnClickListener {
            val intentGoToBurgersPage = Intent(this, Activity_Burgers_Page::class.java)
            startActivity(intentGoToBurgersPage)
        }

        buttonPizza.setOnClickListener {
            val intentGoToPizzaPage = Intent(this, Activity_Pizza_Page::class.java)
            startActivity(intentGoToPizzaPage)
        }
    }
}
