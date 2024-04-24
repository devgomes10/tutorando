import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

private enum class BottomNavRoute(val route: String) {
    PROFILE("profile"),
    SEARCH("search"),
    HISTORIC("historic")
}

@Composable
fun MenuNavigator() {
    val navController = rememberNavController()

    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = BottomNavRoute.PROFILE.route) {
            addBottomNavigation(navController)
        }
    }
}

private fun NavGraphBuilder.addBottomNavigation(navController: NavController) {
    
}