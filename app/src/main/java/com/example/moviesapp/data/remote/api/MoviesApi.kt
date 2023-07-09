package com.example.moviesapp.data.remote.api

import com.example.moviesapp.commons.Constants
import com.example.moviesapp.data.remote.dto.NowPlayingMoviesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET(Constants.NOW_PLAYING_ENDPOINT)
    suspend fun getNowPlayingMovies(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = Constants.API_KEY,
        @Query("language") language: String = Constants.QUERY_PARAM_LANGUAGE
    ): Response<NowPlayingMoviesResponse>
}
