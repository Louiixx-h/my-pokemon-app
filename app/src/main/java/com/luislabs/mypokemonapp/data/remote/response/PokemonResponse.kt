package com.luislabs.mypokemonapp.data.remote.response

import com.google.gson.annotations.SerializedName
import com.luislabs.mypokemonapp.domain.entity.PokemonEntity
import com.luislabs.mypokemonapp.domain.entity.PokemonListEntity

data class PokemonListResponse(
    @SerializedName("count") val total: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("results") val results: List<PokemonResponse>
)

data class PokemonResponse(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)

fun PokemonListResponse.mapToEntity(): PokemonListEntity {
    return PokemonListEntity(
        total = this.total,
        next = this.next,
        results = this.results.map {
            PokemonEntity(
                id = 0,
                name = it.name,
                url = it.url
            )
        }
    )
}