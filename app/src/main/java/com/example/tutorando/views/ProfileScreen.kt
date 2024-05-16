package com.example.tutorando.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.tutorando.R

@Composable
fun ProfileScreen() {

    var name by remember {
        mutableStateOf("")
    }

    var about by remember {
        mutableStateOf("")
    }

    var selectedRole by remember { mutableStateOf<Role?>(Role.MENTOR) }

    var selectedTechnologies by remember {
        mutableStateOf(
            mapOf(
                "Kotlin" to false,
                "Swift" to false,
                "Flutter" to false,
                "React Native" to false
            )
        )
    }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 16.dp)
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Header
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(160.dp)
                            .background(colorResource(id = R.color.blue))
                    ) {
                        Spacer(modifier = Modifier.height(16.dp))
                        Image(
                            painter = painterResource(id = R.drawable.profile_image),
                            contentDescription = "Imagem de perfil",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop,
                        )
                    }
                    // Form
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 32.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .offset(y = (-30).dp)
                                .fillMaxWidth(),
                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xff7989fc)),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(
                                    vertical = 16.dp,
                                    horizontal = 32.dp
                                )
                            ) {
                                OutlinedTextField(
                                    value = name,
                                    onValueChange = {
                                        name = it
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    placeholder = {
                                        Text(text = "Qual seu nome?")
                                    },
                                    colors = OutlinedTextFieldDefaults.colors(
                                        unfocusedBorderColor = colorResource(id = R.color.blue),
                                        focusedBorderColor = colorResource(id = R.color.blue)
                                    ),
                                    shape = RoundedCornerShape(16.dp),
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(text = "Selecione sua função:", color = Color.White)
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        RadioButton(
                                            selected = selectedRole == Role.MENTOR,
                                            onClick = { selectedRole = Role.MENTOR },
                                            colors = RadioButtonDefaults.colors(
                                                selectedColor = colorResource(id = R.color.blue)
                                            )
                                        )
                                        Text(
                                            text = "Mentor",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }

                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        RadioButton(
                                            selected = selectedRole == Role.APRENDIZ,
                                            onClick = { selectedRole = Role.APRENDIZ },
                                            colors = RadioButtonDefaults.colors(
                                                selectedColor = colorResource(id = R.color.blue)
                                            )
                                        )
                                        Text(
                                            text = "Aprendiz",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(16.dp))
                                Text(text = "Selecione as tecnologias:", color = Color.White)
                                Column {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        Checkbox(
                                            checked = selectedTechnologies["Kotlin"] ?: false,
                                            onCheckedChange = { isChecked ->
                                                selectedTechnologies =
                                                    selectedTechnologies.toMutableMap().apply {
                                                        this["Kotlin"] = isChecked
                                                    }
                                            }
                                        )
                                        Text(
                                            text = "Kotlin",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }

                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        Checkbox(
                                            checked = selectedTechnologies["Swift"] ?: false,
                                            onCheckedChange = { isChecked ->
                                                selectedTechnologies =
                                                    selectedTechnologies.toMutableMap().apply {
                                                        this["Swift"] = isChecked
                                                    }
                                            }
                                        )
                                        Text(
                                            text = "Swift",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }

                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        Checkbox(
                                            checked = selectedTechnologies["Flutter"] ?: false,
                                            onCheckedChange = { isChecked ->
                                                selectedTechnologies =
                                                    selectedTechnologies.toMutableMap().apply {
                                                        this["Flutter"] = isChecked
                                                    }
                                            }
                                        )
                                        Text(
                                            text = "Flutter",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }

                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                    ) {
                                        Checkbox(
                                            checked = selectedTechnologies["React Native"] ?: false,
                                            onCheckedChange = { isChecked ->
                                                selectedTechnologies =
                                                    selectedTechnologies.toMutableMap().apply {
                                                        this["React Native"] = isChecked
                                                    }
                                            }
                                        )
                                        Text(
                                            text = "React Native",
                                            modifier = Modifier.padding(start = 8.dp),
                                            color = Color.White,
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.height(16.dp))
                                OutlinedTextField(
                                    value = about,
                                    onValueChange = {
                                        about = it
                                    },
                                    modifier = Modifier.fillMaxWidth(),
                                    placeholder = {
                                        Text(text = "Conte sobre você")
                                    },
                                    colors = OutlinedTextFieldDefaults.colors(
                                        unfocusedBorderColor = colorResource(id = R.color.blue),
                                        focusedBorderColor = colorResource(id = R.color.blue)
                                    ),
                                    shape = RoundedCornerShape(16.dp),
                                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                                )
                                Spacer(modifier = Modifier.height(16.dp))
                                ElevatedButton(
                                    onClick = { },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    elevation = ButtonDefaults.elevatedButtonElevation(8.dp),
                                    colors = ButtonDefaults.elevatedButtonColors(Color.Blue)
                                ) {
                                    Text(text = "Confirmar", color = Color.White)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

enum class Role {
    MENTOR,
    APRENDIZ
}