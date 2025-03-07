package ru.memeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.plywood.memeapp.ui.screens.auth.LoginScreen
import ru.plywood.memeapp.ui.screens.home.HomeScreen
import ru.plywood.memeapp.ui.viewmodels.AuthViewModel
import ru.plywood.memeapp.ui.viewmodels.PostViewModel

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            val authViewModel: AuthViewModel = viewModel()
            LoginScreen(navController, authViewModel)
        }
        composable("home") {
            val postViewModel: PostViewModel = viewModel()
            HomeScreen(navController, postViewModel)
        }
    }
}