package com.example.moviesapp.domain.use_case

import com.example.moviesapp.commons.ResponseResult
import com.example.moviesapp.domain.model.NowPlayingMovie

interface GetNowPlayingMoviesUseCase {

    suspend fun getNowPlayingMovies(page: Int): ResponseResult<List<NowPlayingMovie>>
}
