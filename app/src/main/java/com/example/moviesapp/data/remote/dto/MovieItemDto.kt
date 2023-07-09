package com.example.moviesapp.data.remote.dto

import com.example.moviesapp.commons.Constants.EMPTY_FLOAT
import com.example.moviesapp.commons.Constants.EMPTY_STRING
import com.squareup.moshi.Json

data class MovieItemDto(
    @Json(name = "id")
    val id: String,
    @Json(name = "title")
    val title: String = EMPTY_STRING,
    @Json(name = "overview")
    val overview: String = EMPTY_STRING,
    @Json(name = "poster_path")
    val poster: String = EMPTY_STRING,
    @Json(name = "release_date")
    val releaseDate: String = EMPTY_STRING,
    @Json(name = "vote_average")
    val voteAverage: Float = EMPTY_FLOAT
)
