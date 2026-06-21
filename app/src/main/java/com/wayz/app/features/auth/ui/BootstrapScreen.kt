package com.wayz.app.features.auth.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.wayz.app.core.session.SessionManager
import kotlinx.coroutines.flow.firstOrNull

@Composable
fun BootstrapScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToHome: () -> Unit,
    sessionManager: SessionManager
) {
    val accessToken by sessionManager.accessTokenFlow.collectAsState(initial = null)

    LaunchedEffect(accessToken) {
        if (accessToken != null) {
            onNavigateToHome()
        } else {
            onNavigateToLogin()
        }
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        CircularProgressIndicator()
    }
}
