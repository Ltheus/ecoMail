package br.com.ecoMail.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.ecoMail.R
import br.com.ecoMail.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    var emailText by remember {
        mutableStateOf("")
    }
    var passwordText by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .padding(1.dp)
            .fillMaxHeight()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Image(
            painter = painterResource(id = R.drawable.ecomail_logo),
            contentDescription = "ecoMail logo",
            modifier = Modifier.size(260.dp)
        )
        Column(
            Modifier.height(270.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            TextField(
                shape = RoundedCornerShape(size = 50.dp),
                value = emailText,
                onValueChange = { emailText = it },
                label = {
                    Text(
                        text = "Enter your e-mail",
                        fontSize = 18.sp
                    )
                }
            )
            TextField(
                shape = RoundedCornerShape(size = 50.dp),
                value = passwordText,
                onValueChange = { passwordText = it },
                label = {
                    Text(
                        text = "Enter your password",
                        fontSize = 18.sp
                    )
                },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            ElevatedButton(
                onClick = { navController.navigate("home") },
                colors = ButtonDefaults.buttonColors(containerColor = Green)
            ) {
                Text(text = "ENTER", fontSize = 24.sp)
            }
        }
    }
}