package com.example.gamesapp.presentation

import com.example.gamesapp.data.Game
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {
    @GET("games")
    suspend fun getTopFreeGames(): Response<List<Game>>
}