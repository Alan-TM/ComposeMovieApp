package com.example.moviesapp.commons

import com.example.moviesapp.BuildConfig

object Constants {
    // API
    internal const val API_KEY = BuildConfig.API_KEY
    internal const val BASE_URL = "https://api.themoviedb.org/3/"
    internal const val MOVIE_COVER_BASE_URL = "https://image.tmdb.org/t/p/w200//"
    internal const val NOW_PLAYING_ENDPOINT = "movie/now_playing"
    internal const val QUERY_PARAM_LANGUAGE = "en"

    // String
    internal const val EMPTY_STRING = ""
    internal const val EMPTY_FLOAT = 0f
}
