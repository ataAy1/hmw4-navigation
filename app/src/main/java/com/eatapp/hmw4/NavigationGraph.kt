package com.eatapp.hmw4

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa") { Anasayfa(navController) }
        composable("sayfaA") { SayfaA(navController) }
        composable("sayfaB") { SayfaB(navController) }
        composable("sayfaX") { SayfaX(navController) }
        composable("sayfaY") { SayfaY(navController) }
    }
}
