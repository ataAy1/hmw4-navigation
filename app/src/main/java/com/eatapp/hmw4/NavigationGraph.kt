package com.eatapp.hmw4

import androidx.compose.runtime.*
import androidx.navigation.compose.*
import com.eatapp.hmw4.screens.Anasayfa
import com.eatapp.hmw4.screens.SayfaA
import com.eatapp.hmw4.screens.SayfaB
import com.eatapp.hmw4.screens.SayfaX
import com.eatapp.hmw4.screens.SayfaY

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
