package ru.plywood.memeapp.data.models

data class CommunityMember(
    val id: Int,
    val userId: Int,
    val communityId: Int,
    val joinedAt: String
)