package com.example.moviesapp.commons

sealed class ResponseResult<out T> {
    data class Success<T>(val data: T) : ResponseResult<T>()

    class Failure<Nothing>(
        val cause: Cause
    ) : ResponseResult<Nothing>() {
        sealed class Cause {
            object EmptyListError : Cause()
            object NotFoundError : Cause()
            object BadRequest : Cause()
            object ServerError : Cause()
            object UnknownError : Cause()
        }
    }
}
