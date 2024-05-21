package com.example.tutorando.models
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.tutorando.views.Role

class ProfileViewModel : ViewModel() {
    var name = mutableStateOf("")
    var about = mutableStateOf("")
    var selectedRole = mutableStateOf<Role?>(Role.MENTOR)
    var selectedTechnologies = mutableStateOf(
        mapOf(
            "Kotlin" to false,
            "Swift" to false,
            "Flutter" to false,
            "React Native" to false
        )
    )
}