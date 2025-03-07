package ru.plywood.memeapp.data.models

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String,
    val tokenType: String
)