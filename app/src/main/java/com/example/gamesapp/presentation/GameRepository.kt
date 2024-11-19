package com.example.gamesapp.presentation

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameRepository {
    private val api: GameApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.freetogame.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(GameApi::class.java)
    }

    suspend fun getGames() = api.getTopFreeGames()
}