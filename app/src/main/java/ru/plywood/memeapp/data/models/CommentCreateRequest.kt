package ru.plywood.memeapp.data.models

data class CommentCreateRequest(
    val text: String,
    val postId: Int
)