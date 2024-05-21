package com.example.tutorando.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tutorando.R
import com.example.tutorando.models.ProfileViewModel

@Composable
fun ProfileScreen(profileViewModel: ProfileViewModel = viewModel()) {
    val name by profileViewModel.name
    val about by profileViewModel.about
    val selectedRole by profileViewModel.selectedRole
    val selectedTechnologies by profileViewModel.selectedTechnologies

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
    ) {
        item {
            // Form
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_image),
                    contentDescription = "Imagem de perfil",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop,
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = name,
                    onValueChange = {
                        profileViewModel.name.value = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Qual seu nome?")
                    },
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Selecione sua função:")
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        RadioButton(
                            selected = selectedRole == Role.MENTOR,
                            onClick = { profileViewModel.selectedRole.value = Role.MENTOR },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = colorResource(id = R.color.lightPurple)
                            )
                        )
                        Text(
                            text = "Mentor",
                            modifier = Modifier.padding(start = 8.dp),
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
                            onClick = { profileViewModel.selectedRole.value = Role.APRENDIZ },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = colorResource(id = R.color.lightPurple)
                            )
                        )
                        Text(
                            text = "Aprendiz",
                            modifier = Modifier.padding(start = 8.dp),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Selecione as tecnologias:")
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    ) {
                        Checkbox(
                            checked = selectedTechnologies["Kotlin"] ?: false,
                            colors = CheckboxDefaults.colors(colorResource(id = R.color.lightPurple)),
                            onCheckedChange = { isChecked ->
                                profileViewModel.selectedTechnologies.value =
                                    selectedTechnologies.toMutableMap().apply {
                                        this["Kotlin"] = isChecked
                                    }
                            }
                        )
                        Text(
                            text = "Kotlin",
                            modifier = Modifier.padding(start = 8.dp),
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
                            colors = CheckboxDefaults.colors(colorResource(id = R.color.lightPurple)),
                            onCheckedChange = { isChecked ->
                                profileViewModel.selectedTechnologies.value =
                                    selectedTechnologies.toMutableMap().apply {
                                        this["Swift"] = isChecked
                                    }
                            }
                        )
                        Text(
                            text = "Swift",
                            modifier = Modifier.padding(start = 8.dp),
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
                            colors = CheckboxDefaults.colors(colorResource(id = R.color.lightPurple)),
                            onCheckedChange = { isChecked ->
                                profileViewModel.selectedTechnologies.value =
                                    selectedTechnologies.toMutableMap().apply {
                                        this["Flutter"] = isChecked
                                    }
                            }
                        )
                        Text(
                            text = "Flutter",
                            modifier = Modifier.padding(start = 8.dp),
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
                            colors = CheckboxDefaults.colors(colorResource(id = R.color.lightPurple)),
                            onCheckedChange = { isChecked ->
                                profileViewModel.selectedTechnologies.value =
                                    selectedTechnologies.toMutableMap().apply {
                                        this["React Native"] = isChecked
                                    }
                            }
                        )
                        Text(
                            text = "React Native",
                            modifier = Modifier.padding(start = 8.dp),
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = about,
                    onValueChange = {
                        profileViewModel.about.value = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Conte sobre você")
                    },
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
                    colors = ButtonDefaults.elevatedButtonColors(colorResource(id = R.color.lightPurple))
                ) {
                    Text(text = "Confirmar", color = Color.White)
                }
            }
        }
    }
}

enum class Role {
    MENTOR,
    APRENDIZ
}
