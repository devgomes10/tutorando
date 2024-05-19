package com.example.tutorando.views.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tutorando.R
import com.example.tutorando.views.Role

@Composable
fun Register() {

    var name by remember {
        mutableStateOf("")
    }

    var city by remember {
        mutableStateOf("")
    }

    var phone by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
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
                Text(text = "Faça seu cadastro", fontSize = 32.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(28.dp))
                OutlinedTextField(
                    value = name,
                    onValueChange = {
                                    name = it
                    },
                    label = { Text(text = "Nome") },
                    placeholder = {
                        Text(
                            text = "Digite seu nome"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = city,
                    onValueChange = {
                                    city = it
                    },
                    label = { Text(text = "Cidade") },
                    placeholder = {
                        Text(
                            text = "Qual cidade você mora?"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = phone,
                    onValueChange = {
                                    phone = it
                    },
                    label = { Text(text = "Telefone") },
                    placeholder = {
                        Text(
                            text = "Qual seu telefone?"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
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
                            onClick = { selectedRole = Role.MENTOR },
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
                            onClick = { selectedRole = Role.APRENDIZ },
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
                                selectedTechnologies =
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
                                selectedTechnologies =
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
                                selectedTechnologies =
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
                                selectedTechnologies =
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
                    value = email,
                    onValueChange = {
                                    email = it
                    },
                    label = { Text(text = "E-mail") },
                    placeholder = {
                        Text(
                            text = "insira seu email"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = {
                                    password = it
                    },
                    label = { Text(text = "Senha") },
                    placeholder = {
                        Text(
                            text = "Crie uma senha"
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Confirmar")
                }
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Voltar")
                }
            }
        }
    }
}