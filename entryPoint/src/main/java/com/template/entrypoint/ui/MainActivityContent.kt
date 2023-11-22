package com.template.entrypoint.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.template.appdestinations.AppDestinations
import com.template.entrypoint.theme.MainAppTheme
import com.template.presentation.ui.components.game.addGameScreen

@Composable
fun MainActivityContent() {
    MainAppTheme {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = AppDestinations.Game //SET TO LOADING
        ) {
            addGameScreen(navController)
        }
    }
}