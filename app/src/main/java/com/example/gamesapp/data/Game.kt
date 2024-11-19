package com.example.gamesapp.data

import com.google.gson.annotations.SerializedName

data class Game(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String,
    @SerializedName("game_url")
    val gameUrl: String
)
