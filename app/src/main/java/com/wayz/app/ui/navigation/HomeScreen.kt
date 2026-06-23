package com.wayz.app.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.wayz.app.ui.places.PlacesScreen
import com.wayz.app.ui.events.EventsScreen
import com.wayz.app.ui.social.SocialFeedScreen

@Composable
fun HomeScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                
                NavigationBarItem(
                    selected = currentRoute == "places",
                    onClick = { navController.navigate("places") },
                    icon = { Text("P") },
                    label = { Text("Places") }
                )
                NavigationBarItem(
                    selected = currentRoute == "events",
                    onClick = { navController.navigate("events") },
                    icon = { Text("E") },
                    label = { Text("Events") }
                )
                NavigationBarItem(
                    selected = currentRoute == "social",
                    onClick = { navController.navigate("social") },
                    icon = { Text("S") },
                    label = { Text("Social") }
                )
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "places",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("places") { PlacesScreen() }
            composable("events") { EventsScreen() }
            composable("social") { SocialFeedScreen() }
        }
    }
}
