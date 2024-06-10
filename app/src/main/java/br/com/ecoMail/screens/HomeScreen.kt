package br.com.ecoMail.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.ecoMail.R
import br.com.ecoMail.repository.getEmails
import br.com.ecoMail.ui.theme.Green
import br.com.ecoMail.ui.theme.LightGray

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = { navController.navigate("profile") }) {
                Icon(
                    painter = painterResource(id = R.drawable.profile_icon),
                    contentDescription = "Profile",
                    modifier = Modifier.size(60.dp),
                )
            }
            Row(
                modifier = Modifier.width(width = 210.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.padding(horizontal = 5.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Welcome,",
                        fontSize = 18.sp,
                        color = Green
                    )
                    Text(
                        text = "User!",
                        fontSize = 20.sp,
                    )
                }
            }
            Row {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.size(40.dp),
                        tint = Green
                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Create,
                        contentDescription = "Reply",
                        modifier = Modifier.size(40.dp),
                        tint = Green
                    )
                }
            }

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "INBOX",
                fontSize = 24.sp,
                fontWeight = FontWeight(700),
                modifier = Modifier
                    .padding(vertical = 10.dp),

                )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "ALL",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Green
                )
                Text(
                    text = "STARRED",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color.Gray

                )
                Text(
                    text = "PROMOTIONS",
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color.Gray
                )
            }
        }
        LazyColumn {
            items(getEmails()) {
                Column {
                    Row(
                        modifier = Modifier
                            .background(color = LightGray)
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(horizontal = 15.dp)
                            .clickable { navController.navigate("emailBody") },
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.profile_icon),
                            contentDescription = "Profile",
                            modifier = Modifier.size(60.dp)
                        )
                        Column {
                            Text(
                                text = it.senderName,
                                fontSize = 24.sp,
                                fontWeight = FontWeight(600)
                            )
                            Text(
                                text = it.emailSubject,
                                fontSize = 18.sp
                            )
                            Text(
                                text = it.emailText,
                                fontSize = 16.sp,
                                fontWeight = FontWeight(600),
                                color = Color.Gray,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.width(300.dp)
                            )
                        }
                        Icon(
                            painter = painterResource(id = R.drawable.star),
                            contentDescription = "Star",
                            modifier = Modifier.size(30.dp)
                        )

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    
                }
            }
        }

    }
}