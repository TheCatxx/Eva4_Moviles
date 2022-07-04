package com.thecatxx.pokeapi.pokelist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thecatxx.pokeapi.network.Pokemon

class PokemonAdapter(val list: PokemonsFragment): RecyclerView.Adapter<PokemonViewHolder>() {

    private var pokeList = emptyList<Pokemon>()

    fun setPokemons(pokemon: List<Pokemon>) {
        this.pokeList = pokemon
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = pokeList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PokemonViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokeList[position]
        holder.bind(pokemon)
    }

}