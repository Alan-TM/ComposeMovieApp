package com.example.moviesapp.data.remote.dto

import com.squareup.moshi.Json

data class NowPlayingMoviesResponse(
    @Json(name = "page")
    val page: Int,
    @Json(name = "results")
    val nowPlayingList: List<MovieItemDto> = emptyList()
)
