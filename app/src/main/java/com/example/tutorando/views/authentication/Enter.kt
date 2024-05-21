package com.example.tutorando.views.authentication

import ShowNavigationBar
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Enter() {
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var isLoggedIn by rememberSaveable { mutableStateOf(false) }
    var isRegistering by rememberSaveable { mutableStateOf(false) }

    if (isLoggedIn) {
        ShowNavigationBar()
    } else {
        if (isRegistering) {
            Register(onBack = { isRegistering = false })
        } else {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(24.dp))
                Text(text = "Tutorando", fontSize = 38.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(26.dp))
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "E-mail") }
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Senha") }
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "Esqueci minha senha", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(onClick = {
                    isLoggedIn = true
                }) {
                    Text(text = "Entrar")
                }
                Spacer(modifier = Modifier.height(26.dp))
                OutlinedButton(onClick = {
                    isRegistering = true
                }) {
                    Text(text = "Cadastrar")
                }
            }
        }
    }
}
