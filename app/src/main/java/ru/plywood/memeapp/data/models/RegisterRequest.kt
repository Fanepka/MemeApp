package ru.plywood.memeapp.data.models

data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String
)