package com.thecatxx.pokeapi.pokelist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thecatxx.pokeapi.network.Pokemon
import com.thecatxx.pokeapi.network.PokemonRespone
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class PokemonViewModel: ViewModel() {

    private val repository = PokemonRepository()
    private val disposable = CompositeDisposable()
    val pokemonListResponse = MutableLiveData<List<Pokemon>>()

    fun listarPokemon() {
        disposable.add(
            repository.listarPokemon(10, 0)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<PokemonRespone>() {
                    override fun onSuccess(t: PokemonRespone) {

                        var listPokemones = t.results
                        pokemonListResponse.value = listPokemones
                        Log.v("POKEMON_LIST", listPokemones.toString())

                    }

                    override fun onError(e: Throwable) {

                    }
                })
        )
    }

}