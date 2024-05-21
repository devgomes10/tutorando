package com.example.tutorando.models
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class FavoritesViewModel : ViewModel() {
    private val _favorites = mutableStateListOf<Student>()
    val favorites: List<Student> get() = _favorites

    fun addFavorite(student: Student) {
        if (!_favorites.contains(student)) {
            _favorites.add(student)
        }
    }
}
