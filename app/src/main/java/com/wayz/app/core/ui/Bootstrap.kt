package com.wayz.app.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.wayz.app.core.session.SessionManager
import kotlinx.coroutines.flow.first

@Composable
fun Bootstrap(
    sessionManager: SessionManager,
    loadingContent: @Composable () -> Unit = {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    },
    content: @Composable (isLoggedIn: Boolean) -> Unit
) {
    var isInitialized by remember { mutableStateOf(false) }
    var isLoggedIn by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        // Here you can initialize any other SDKs or services you need:
        // e.g. FirebaseApp.initializeApp(context)
        // e.g. Analytics.initialize()

        // Read the first session state value
        val token = sessionManager.accessTokenFlow.first()
        isLoggedIn = !token.isNullOrEmpty()
        isInitialized = true
    }

    if (!isInitialized) {
        loadingContent()
    } else {
        content(isLoggedIn)
    }
}
