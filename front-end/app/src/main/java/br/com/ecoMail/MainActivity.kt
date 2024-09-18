package br.com.ecoMail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.ecoMail.screens.EmailBodyScreen
import br.com.ecoMail.screens.HomeScreen
import br.com.ecoMail.screens.LoginScreen
import br.com.ecoMail.screens.ProfileScreen
import br.com.ecoMail.ui.theme.EcoMailTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoMailTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ){
                        composable(route = "login") {
                            LoginScreen(navController = navController)
                        }
                        composable(route = "home"){ HomeScreen(navController = navController) }
                        composable(route = "profile"){ ProfileScreen(navController = navController) }
                        composable(route = "emailBody"){ EmailBodyScreen(navController = navController) }
                    }
                }
            }
        }
    }
}