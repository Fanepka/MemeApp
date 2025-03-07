// ApiService.kt
package ru.plywood.memeapp.data.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import ru.plywood.memeapp.data.models.Post
//import ru.plywood.memeapp.data.models.User
import ru.plywood.memeapp.data.models.LoginRequest
import ru.plywood.memeapp.data.models.TokenResponse

interface ApiService {
    @POST("auth/login")
    suspend fun login(@Body credentials: LoginRequest): Response<TokenResponse>

    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
}