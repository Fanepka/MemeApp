package ru.plywood.memeapp.data.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Field
import retrofit2.http.POST
import retrofit2.http.Path
import ru.memeapp.data.models.Community
import ru.plywood.memeapp.data.models.*

interface ApiService {
    // Авторизация
    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(@Field("username") username: String, @Field("password") password: String): Response<TokenResponse>

    // Регистрация
    @POST("auth/register")
    suspend fun register(@Body user: RegisterRequest): Response<User>

    // Получение постов
    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>

    // Создание поста
    @POST("posts")
    suspend fun createPost(@Body post: PostCreateRequest): Response<Post>

    // Лайк поста
    @POST("posts/{postId}/like")
    suspend fun likePost(@Path("postId") postId: Int): Response<Like>

    // Комментирование поста
    @POST("posts/{postId}/comment")
    suspend fun commentPost(@Path("postId") postId: Int, @Body comment: CommentCreateRequest): Response<Comment>

    // Получение сообществ
    @GET("communities")
    suspend fun getCommunities(): Response<List<Community>>

    // Создание сообщества
    @POST("communities")
    suspend fun createCommunity(@Body community: CommunityCreateRequest): Response<Community>

    // Присоединение к сообществу
    @POST("communities/{communityId}/join")
    suspend fun joinCommunity(@Path("communityId") communityId: Int): Response<CommunityMember>

    // Получение уведомлений
    @GET("notifications")
    suspend fun getNotifications(): Response<List<Notification>>
}