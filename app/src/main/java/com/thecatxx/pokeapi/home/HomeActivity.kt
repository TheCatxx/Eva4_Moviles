package com.thecatxx.pokeapi.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.thecatxx.pokeapi.R
import com.thecatxx.pokeapi.pokelist.PokemonsFragment

class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listpoke)

        val actionBar = supportActionBar
        actionBar?.setDisplayShowHomeEnabled(true)
        title = "Lista de Pokemon's"


        //openFragment(PokemonsFragment.newInstance())

    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayoutContent, fragment)
        transaction.commit()
    }

}