package ru.memeapp.data.models

data class Community(
    val id: Int,
    val name: String,
    val description: String,
    val ownerId: Int,
    val createdAt: String
)