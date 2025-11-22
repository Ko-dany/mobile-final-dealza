package com.example.mobile_final_dealza.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mobile_final_dealza.features.HomeScreen
import com.example.mobile_final_dealza.features.SplashScreen
import com.example.mobile_final_dealza.viewmodel.DealViewModel
import com.example.mobile_final_dealza.viewmodel.UserViewModel

@Composable
fun DealNavHost(navController: androidx.navigation.NavHostController = rememberNavController(), modifier: androidx.compose.ui.Modifier = androidx.compose.ui.Modifier) {
    val dealViewModel: DealViewModel = viewModel()
    val userViewModel: UserViewModel = viewModel()

    // NavHost for routing
    NavHost(navController = navController, startDestination = "splash_screen", modifier = modifier) {

        // Splash Screen
        composable(route = "splash_screen") {
            SplashScreen(onTimeout = {
                // Navigate to the login screen after the splash delay
                navController.navigate(route = "home_screen") {
                    popUpTo(route = "splash_screen") { inclusive = true }
                }
            })
        }

        composable(route = "home_screen") {
            HomeScreen()
        }


    }
}
