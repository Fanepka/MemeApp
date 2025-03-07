package ru.plywood.memeapp.data.models

data class Notification(
    val id: Int,
    val userId: Int,
    val message: String,
    val createdAt: String,
    val isRead: Boolean
)