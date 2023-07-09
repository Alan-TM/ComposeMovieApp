package com.example.moviesapp.data

import com.example.moviesapp.commons.ResponseResult
import com.example.moviesapp.data.remote.api.MoviesApi
import com.example.moviesapp.data.remote.dto.NowPlayingMoviesResponse
import com.example.moviesapp.data.remote.extensions.nullOrEmptyReturn
import com.example.moviesapp.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val moviesApi: MoviesApi
) : MoviesRepository {

    override suspend fun getNowPlayingMovies(page: Int): ResponseResult<NowPlayingMoviesResponse> {
        val moviesApiResponse = moviesApi.getNowPlayingMovies(page = page)
        return when (moviesApiResponse.code()) {
            200 -> {
                val movieList = moviesApiResponse.body().nullOrEmptyReturn()
                if (movieList.nowPlayingList.isNotEmpty()) {
                    ResponseResult.Success(movieList)
                } else {
                    ResponseResult.Failure(ResponseResult.Failure.Cause.EmptyListError)
                }
            }

            400 -> ResponseResult.Failure(ResponseResult.Failure.Cause.BadRequest)
            404 -> ResponseResult.Failure(ResponseResult.Failure.Cause.NotFoundError)
            500 -> ResponseResult.Failure(ResponseResult.Failure.Cause.ServerError)
            else -> ResponseResult.Failure(ResponseResult.Failure.Cause.UnknownError)
        }
    }
}
