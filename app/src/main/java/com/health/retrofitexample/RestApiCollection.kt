package com.health.retrofitexample

import retrofit2.http.GET

interface RestApiCollection {

    @GET("random_joke")
    suspend fun getJoke(): Joke
}