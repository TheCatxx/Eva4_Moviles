package com.thecatxx.pokeapi.pokelist

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.thecatxx.pokeapi.R
import com.thecatxx.pokeapi.network.Pokemon

class PokemonViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_pokemon, parent, false)){

    private var url: TextView? = null
    private var name: TextView? = null

    init {
        url = itemView.findViewById(R.id.imgPoke)
        name = itemView.findViewById(R.id.textPokeName)
    }

    fun bind(pokemon: Pokemon) {
        url?.text = pokemon.url
        name?.text = pokemon.name
    }
}