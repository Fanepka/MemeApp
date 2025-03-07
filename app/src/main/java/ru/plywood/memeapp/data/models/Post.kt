// Post.kt
package ru.plywood.memeapp.data.models

data class Post(
    val id: Int,
    val text: String,
    val imageUrl: String?,
    val ownerId: Int,
    val communityId: Int?,
    val createdAt: String
)