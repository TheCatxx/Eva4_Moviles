package com.thecatxx.pokeapi.network

import com.google.gson.annotations.SerializedName

data class PokemonRespone (
    @SerializedName("count"    ) var count    : Int?               = null,
    @SerializedName("next"     ) var next     : String?            = null,
    @SerializedName("results"  ) var results  : ArrayList<Pokemon> = arrayListOf()
)

data class Pokemon (
    @SerializedName("name" ) var name : String? = null,
    @SerializedName("url"  ) var url  : String? = null
)