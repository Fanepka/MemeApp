package ru.plywood.memeapp.data.models

data class Comment(
    val id: Int,
    val text: String,
    val userId: Int,
    val postId: Int,
    val createdAt: String
)