package com.thecatxx.pokeapi.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    // https://pokeapi.co/api/v2/pokemon?limit=100&offset=0
    @GET("api/v2/pokemon")
    fun listPokemon(@Query("limit") limit: Int, @Query("offset") offset: Int): Single<PokemonRespone>

    // https://pokeapi.co/api/v2/pokemon/ditto
    @GET("api/v2/pokemon/{nombre}")
    fun detallePokemon(@Path("nombre") nombre: String)



}