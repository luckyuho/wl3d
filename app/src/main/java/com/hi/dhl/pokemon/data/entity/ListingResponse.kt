package com.hi.dhl.pokemon.data.entity

import android.util.Log

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/11
 *     desc  :
 * </pre>
 */

data class ListingResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<ListingData>
)

data class ListingData(
    val name: String,
    val url: String
) {
    fun getImageUrl(): String {
//        Log.d("NeededURLInformation", url)
        val index = url.split("/".toRegex()).dropLast(1).last()
//        return "https://pokeres.bastionbot.org/images/pokemon/$index.png"
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$index.png"
    }

    override fun toString(): String {
        return "ListingData(name='$name', url='$url')"
    }
}