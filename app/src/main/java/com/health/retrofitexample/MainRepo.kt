package com.health.retrofitexample

interface MainRepo {
    suspend fun getJoke() : Joke?

}