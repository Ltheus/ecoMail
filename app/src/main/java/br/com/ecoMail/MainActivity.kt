package br.com.ecoMail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.ecoMail.screens.EmailBodyScreen
import br.com.ecoMail.screens.ProfileScreen
import br.com.ecoMail.ui.theme.EcoMailTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoMailTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
//                  LoginScreen()
//                  ProfileScreen()
                    EmailBodyScreen()
                }
            }
        }
    }
}