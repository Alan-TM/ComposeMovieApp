package com.example.moviesapp.data.remote.dto

import com.squareup.moshi.Json

data class MovieItemDto(
    @Json(name = "id")
    val id: String,
    @Json(name = "title")
    val title: String? = null,
    @Json(name = "overview")
    val overview: String? = null,
    @Json(name = "poster_path")
    val poster: String? = null,
    @Json(name = "release_date")
    val releaseDate: String? = null,
    @Json(name = "vote_average")
    val voteAverage: Float? = null
)
