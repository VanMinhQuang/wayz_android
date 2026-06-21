package com.wayz.app.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wayz.app.features.auth.ui.BootstrapScreen
import com.wayz.app.features.auth.ui.LoginScreen
import com.wayz.app.features.auth.ui.RegisterOtpScreen
import com.wayz.app.core.session.SessionManager

@Composable
fun WayzNavGraph(sessionManager: SessionManager? = null) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "bootstrap") {
        composable("bootstrap") {
            if (sessionManager != null) {
                BootstrapScreen(
                    onNavigateToLogin = {
                        navController.navigate("login") {
                            popUpTo("bootstrap") { inclusive = true }
                        }
                    },
                    onNavigateToHome = {
                        navController.navigate("home") {
                            popUpTo("bootstrap") { inclusive = true }
                        }
                    },
                    sessionManager = sessionManager
                )
            }
        }
        composable("login") {
            LoginScreen(
                onLoginSuccess = { 
                    navController.navigate("home") {
                        popUpTo("login") { inclusive = true }
                    }
                }
            )
        }
        composable("register") {
            RegisterOtpScreen(
                onRegisterSuccess = { 
                    navController.navigate("home") {
                        popUpTo("register") { inclusive = true }
                    }
                }
            )
        }
        composable("home") {
            HomeScreen()
        }
    }
}
