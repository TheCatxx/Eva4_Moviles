package com.thecatxx.pokeapi.pokelist

import com.thecatxx.pokeapi.network.ApiService
import com.thecatxx.pokeapi.network.PokemonRespone
import io.reactivex.Single

class PokemonRepository {

    private val api = ApiService().apiService
    fun listarPokemon(limit: Int, offset: Int): Single<PokemonRespone> {
        return api.listPokemon(limit, offset)
    }
}