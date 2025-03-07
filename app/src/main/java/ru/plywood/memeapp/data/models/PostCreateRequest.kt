package ru.plywood.memeapp.data.models

data class PostCreateRequest(
    val text: String,
    val imageUrl: String?,
    val communityId: Int?
)