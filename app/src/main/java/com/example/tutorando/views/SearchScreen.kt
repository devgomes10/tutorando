package com.example.tutorando.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorando.R

@Composable
fun SearchScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.student),
                    contentDescription = "Imagem de perfil",
                    modifier = Modifier
                        .size(180.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Maria Silva", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(Color.Red)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "No",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(18.dp))
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(Color.Green)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = "Yes",
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Kotlin | Flutter", fontSize = 18.sp, fontStyle = FontStyle.Italic)
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Olá, estou procurando um mentor para me instruir na minha jornada como desenvolvedora mobile. Quero que o foco seja kotlin e Flutter")
            }
        }
    }
}
