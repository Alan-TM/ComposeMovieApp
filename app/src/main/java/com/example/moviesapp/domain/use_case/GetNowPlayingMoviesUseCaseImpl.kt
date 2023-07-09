package com.example.moviesapp.domain.use_case

import com.example.moviesapp.commons.ResponseResult
import com.example.moviesapp.domain.mapper.NowPlayingMovieResponseMapper.map
import com.example.moviesapp.domain.model.NowPlayingMovie
import com.example.moviesapp.domain.repository.MoviesRepository

class GetNowPlayingMoviesUseCaseImpl(
    private val repository: MoviesRepository
) : GetNowPlayingMoviesUseCase {

    // TODO fix this issue.
    override suspend fun getNowPlayingMovies(page: Int): ResponseResult<List<NowPlayingMovie>> {
        return when (val response = repository.getNowPlayingMovies(page)) {
            is ResponseResult.Success -> {
                ResponseResult.Success(response.data.map())
            }
            else -> response
        }
    }
}
