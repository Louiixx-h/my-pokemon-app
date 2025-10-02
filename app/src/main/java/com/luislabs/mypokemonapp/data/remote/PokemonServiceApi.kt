package com.luislabs.mypokemonapp.data.remote

import com.luislabs.mypokemonapp.data.remote.response.PokemonListResponse
import retrofit2.Call
import retrofit2.http.GET

interface PokemonServiceApi {

    @GET(value = POKEMON_ENDPOINT)
    fun getPokemonList(): Call<PokemonListResponse>

    companion object {
        private const val POKEMON_ENDPOINT = "api/v2/pokemon"
    }
}