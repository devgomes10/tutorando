package com.example.tutorando.models

data class Person(
    val id: Long = 0,
    val name: String = "",
    val skills: List<String> = emptyList(),
    val about: String = "",
    val city: String = "",
    val phone: Number = 0
)