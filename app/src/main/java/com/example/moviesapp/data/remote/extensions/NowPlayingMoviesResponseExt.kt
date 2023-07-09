package com.example.moviesapp.data.remote.extensions

import com.example.moviesapp.data.remote.dto.MovieItemDto
import com.example.moviesapp.data.remote.dto.NowPlayingMoviesResponse

internal fun NowPlayingMoviesResponse?.nullOrEmptyReturn(): NowPlayingMoviesResponse {
    return this ?: NowPlayingMoviesResponse(
        1,
        emptyList<MovieItemDto>()
    )
}
