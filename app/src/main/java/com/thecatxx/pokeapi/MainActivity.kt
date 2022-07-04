package com.thecatxx.pokeapi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thecatxx.pokeapi.home.HomeActivity
import com.thecatxx.pokeapi.pokelist.PokemonsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.hide()

        btnPokeDex.setOnClickListener {
            startActivity(Intent(this, PokemonsFragment::class.java))
        }

    }
}