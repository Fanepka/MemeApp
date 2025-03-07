package ru.plywood.memeapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.plywood.memeapp.data.api.RetrofitClient
import ru.plywood.memeapp.data.models.LoginRequest
import ru.plywood.memeapp.data.models.RegisterRequest
import ru.plywood.memeapp.data.models.TokenResponse

class AuthViewModel : ViewModel() {

    fun login(email: String, password: String, onResult: (TokenResponse?) -> Unit) {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.instance.login(email, password)
                if (response.isSuccessful) {
                    onResult(response.body())
                } else {
                    onResult(null)
                }
            } catch (e: Exception) {
                onResult(null)
            }
        }
    }

    fun register(username: String, email: String, password: String, onResult: (Boolean) -> Unit) {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.instance.register(RegisterRequest(username, email, password))
                onResult(response.isSuccessful)
            } catch (e: Exception) {
                onResult(false)
            }
        }
    }
}