package com.wayz.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.wayz.app.core.session.SessionManager
import com.wayz.app.core.ui.Bootstrap
import com.wayz.app.core.ui.theme.WayzTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WayzTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Bootstrap(sessionManager = sessionManager) { isLoggedIn ->
                        val startDestination = if (isLoggedIn) "home" else "login"
                        WayzNavGraph(startDestination = startDestination)
                    }
                }
            }
        }
    }
}
