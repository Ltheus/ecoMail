package br.com.ecoMail.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.ecoMail.R

@Composable
fun EmailBodyScreen() {
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
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.back_arrowback_arrow),
                    contentDescription = "Arrow",
                    modifier = Modifier.size(25.dp)

                )
            }
            Row {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.archive),
                        contentDescription = "Archive",
                        modifier = Modifier.size(25.dp)

                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.trash),
                        contentDescription = "Trash",
                        modifier = Modifier.size(25.dp)

                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.profile_icon),
                contentDescription = "Trash",
                modifier = Modifier.size(50.dp)
            )
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
                        text = "Sender's name",
                        fontSize = 20.sp,
                        fontWeight = FontWeight(600)
                    )
                    Text(
                        text = "to you",
                        fontSize = 18.sp
                    )
                }
                Text(text = "13:46")
            }
            Row {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = "Star",
                        modifier = Modifier.size(25.dp)

                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.reply),
                        contentDescription = "Reply",
                        modifier = Modifier.size(25.dp)

                    )
                }
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.forward),
                        contentDescription = "Forward",
                        modifier = Modifier.size(25.dp)

                    )
                }
            }

        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 10.dp)) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam rhoncus fringilla fringilla. Sed egestas viverra turpis, blandit laoreet est ultricies at. Cras nec gravida enim. Fusce sit amet sem magna. Vivamus facilisis luctus arcu. Duis vel risus finibus, dictum velit sed, euismod quam. Nunc vitae mauris sed metus dignissim semper. Praesent sit amet gravida ex. Aenean id scelerisque elit, sit amet iaculis augue. Donec ultricies sagittis aliquam. Nullam non sapien quis est pretium porta quis ac purus. Nunc vel facilisis lectus.\n" +
                        "Integer eget ipsum vel felis dignissim fringilla vitae sit amet augue. Praesent facilisis feugiat aliquam. Nulla enim turpis, tristique ut felis a, placerat accumsan turpis. Vivamus ut sem eleifend, rhoncus enim non, viverra erat. Sed in urna lacus. Aenean vel eros fringilla, condimentum massa vel, accumsan diam. In orci orci, egestas in mauris at, elementum elementum turpis. Curabitur porttitor cursus nibh, at dictum ligula pretium in. Donec consectetur laoreet tincidunt. Vestibulum gravida maximus mauris id dictum. Nullam varius arcu orci, a imperdiet neque bibendum quis. Praesent ac elit ut urna feugiat elementum ut ut tellus.\n" +
                        "Maecenas bibendum ornare finibus. Nam scelerisque consequat libero vitae posuere. In pharetra tortor at est dictum posuere. Suspendisse potenti. Curabitur elementum a lectus in tempor. Praesent ultricies molestie libero a dignissim. Integer at congue tellus, et vestibulum augue. Donec sollicitudin quam eget urna blandit.",
                fontSize = 18.sp
            )
        }
    }
}