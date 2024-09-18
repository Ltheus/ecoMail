package br.com.ecoMail.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.ecoMail.R
import br.com.ecoMail.ui.theme.Green

@Composable
fun ProfileScreen(navController: NavController) {
    var nameText by remember {
        mutableStateOf("")
    }
    var birthdayText by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .padding(1.dp)
            .fillMaxHeight()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(
                onClick = { navController.navigate("home") },
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.back_arrowback_arrow),
                    contentDescription = "Arrow",
                    modifier = Modifier.size(25.dp)

                )
            }
            Text(
                text = "Profile",
                fontSize = 24.sp,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 30.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_cam_icons),
                    contentDescription = "Profile Picture",
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = "user@email.com",
                    color = Color.DarkGray,
                    fontSize = 24.sp
                )
            }
            Column(
                modifier = Modifier.padding(top = 20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    shape = RoundedCornerShape(size = 50.dp),
                    value = nameText,
                    onValueChange = { nameText = it },
                    label = {
                        Text(
                            text = "Name",
                            fontSize = 18.sp
                        )
                    }
                )
                TextField(
                    shape = RoundedCornerShape(size = 50.dp),
                    value = birthdayText,
                    onValueChange = { birthdayText = it },
                    label = {
                        Text(
                            text = "Birthday",
                            fontSize = 18.sp
                        )
                    }
                )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Green)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(vertical = 2.dp)
                            .width(250.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Lock")
                        Text(
                            text = "Change Password",
                            fontSize = 18.sp
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "Arrow"
                        )
                    }
                }
            }
        }
    }
}