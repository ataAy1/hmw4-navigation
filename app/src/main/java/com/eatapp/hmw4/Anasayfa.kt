package com.eatapp.hmw4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//SAYFA ANASAYFA

@Composable
fun Anasayfa(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Anasayfa", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { navController.navigate("sayfaA") }) {
            Text("GİT > A")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("sayfaX") }) {
            Text("GİT > X")
        }
    }
}
