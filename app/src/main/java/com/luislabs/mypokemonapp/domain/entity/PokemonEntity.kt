package com.luislabs.mypokemonapp.domain.entity

data class PokemonListEntity(
    val total: Int,
    val next: String?,
    val results: List<PokemonEntity>
)

data class PokemonEntity(
    val id: Int,
    val name: String,
    val url: String
)