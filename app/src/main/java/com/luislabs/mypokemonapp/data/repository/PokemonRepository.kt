package com.luislabs.mypokemonapp.data.repository

import com.luislabs.mypokemonapp.data.remote.PokemonServiceApi
import com.luislabs.mypokemonapp.data.remote.response.PokemonListResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokemonRepository {

    fun getPokemonList(): Call<PokemonListResponse> {
        // Configuration
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        // Activation
        val serviceApi = retrofit.create(PokemonServiceApi::class.java)
        // Call endpoint
        return serviceApi.getPokemonList()
    }
}