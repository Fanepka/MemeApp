package ru.plywood.memeapp.data.models

data class Like(
    val id: Int,
    val userId: Int,
    val postId: Int,
    val createdAt: String
)