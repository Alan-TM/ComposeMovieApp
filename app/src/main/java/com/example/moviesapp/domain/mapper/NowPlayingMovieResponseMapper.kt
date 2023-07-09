package com.example.moviesapp.domain.mapper

import com.example.moviesapp.data.remote.dto.NowPlayingMoviesResponse
import com.example.moviesapp.domain.model.NowPlayingMovie

object NowPlayingMovieResponseMapper {

    internal fun NowPlayingMoviesResponse.map(): List<NowPlayingMovie> {
        return this.nowPlayingList.map { movie ->
            NowPlayingMovie(
                id = movie.id,
                title = movie.title,
                poster = movie.poster,
                voteAverage = movie.voteAverage
            )
        }
    }
}
