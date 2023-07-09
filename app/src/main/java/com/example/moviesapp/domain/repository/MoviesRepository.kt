package com.example.moviesapp.domain.repository

import com.example.moviesapp.commons.ResponseResult
import com.example.moviesapp.data.remote.dto.NowPlayingMoviesResponse

interface MoviesRepository {

    suspend fun getNowPlayingMovies(page: Int): ResponseResult<NowPlayingMoviesResponse>
}
