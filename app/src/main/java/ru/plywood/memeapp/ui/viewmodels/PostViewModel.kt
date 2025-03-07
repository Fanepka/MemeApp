package ru.plywood.memeapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.plywood.memeapp.data.api.RetrofitClient
import ru.plywood.memeapp.data.models.Post

class PostViewModel : ViewModel() {
    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> get() = _posts

    fun loadPosts() {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.instance.getPosts()
                if (response.isSuccessful) {
                    _posts.value = response.body() ?: emptyList()
                }
            } catch (e: Exception) {
                // Обработка ошибок
            }
        }
    }
}