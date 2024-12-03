package com.example.annotatedstring.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.annotatedstring.ui.screen.FirstScreen
import com.example.annotatedstring.ui.screen.SecondScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "firstScreen") {
        composable("firstScreen") {
            FirstScreen(navController)
        }
        composable("secondScreen") {
            SecondScreen()
        }
    }
}
