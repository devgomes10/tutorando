package com.example.tutorando

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.tutorando.ui.theme.TutorandoTheme
import com.example.tutorando.views.FavoritesScreen
import com.example.tutorando.views.ProfileScreen
import com.example.tutorando.views.SearchScreen
import com.example.tutorando.views.SettingsScreen

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
)

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorandoTheme {
                val items = listOf(
                    BottomNavigationItem(
                        title = "Perfil",
                        selectedIcon = Icons.Filled.Person,
                        unSelectedIcon = Icons.Outlined.Person,
                    ),
                    BottomNavigationItem(
                        title = "Buscar",
                        selectedIcon = Icons.Filled.Search,
                        unSelectedIcon = Icons.Outlined.Search,
                    ),
                    BottomNavigationItem(
                        title = "Histórico",
                        selectedIcon = Icons.Filled.FavoriteBorder,
                        unSelectedIcon = Icons.Outlined.FavoriteBorder,
                    ),
                    BottomNavigationItem(
                        title = "Ajustes",
                        selectedIcon = Icons.Filled.Settings,
                        unSelectedIcon = Icons.Outlined.Settings,
                    )
                )
                var selectedItemIndex by rememberSaveable {
                    mutableIntStateOf(0)
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        bottomBar = {
                            NavigationBar {
                                items.forEachIndexed { index, item ->
                                    NavigationBarItem(
                                        selected = selectedItemIndex == index,
                                        onClick = {
                                            selectedItemIndex = index
                                        },
                                        label = { Text(text = item.title) },
                                        alwaysShowLabel = false,
                                        icon = {
                                            Icon(
                                                imageVector = if (index == selectedItemIndex) {
                                                    item.selectedIcon
                                                } else item.unSelectedIcon,
                                                contentDescription = item.title
                                            )
                                        }
                                    )
                                }
                            }
                        }
                    ) {
                        when (selectedItemIndex) {
                            0 -> ProfileScreen()
                            1 -> SearchScreen()
                            2 -> FavoritesScreen()
                            3 -> SettingsScreen()
                            else -> Text(text = "Tela não encontrada")
                        }
                    }
                }
            }
        }
    }
}
