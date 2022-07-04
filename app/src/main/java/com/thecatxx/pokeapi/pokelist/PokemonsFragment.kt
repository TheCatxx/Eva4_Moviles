package com.thecatxx.pokeapi.pokelist

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.thecatxx.pokeapi.R
import com.thecatxx.pokeapi.network.Pokemon
import kotlinx.android.synthetic.main.fragment_pokemons.*

class PokemonsFragment: AppCompatActivity(){

    private lateinit var viewModel: PokemonViewModel

    lateinit var  list: List<Pokemon>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_pokemons)

        viewModel = ViewModelProvider(this).get(PokemonViewModel::class.java)

        val actionBar = supportActionBar
        actionBar?.setDisplayShowHomeEnabled(true)
        title = "Lista de Pokemon's"


        observableViewModel()

    }

    private fun observableViewModel() {

        val adapter = PokemonAdapter(this)
        recyclerPokemon.adapter = adapter
        recyclerPokemon.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

        viewModel.pokemonListResponse.observe(this) { listPokemon ->

            if (listPokemon.isNotEmpty()) {

                list = listPokemon
                listPokemon?.let {
                    adapter.setPokemons(listPokemon)
                }


            } else {
                Toast.makeText(this, "Lista Vacia", Toast.LENGTH_SHORT).show()

            }
        }
    }

}