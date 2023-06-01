package com.example.danp_lab03.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.danp_lab03.model.Repository
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun MenuScreen(
    navController: NavController
) {
    val TAG: String = "RoomDatabase"
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {navController.navigate("menu")}
        ) {
            Text(text = "Crear Estudiante")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {}
        ) {
            Text(text = "Crear Curso")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {  }
        ) {
            Text(text = "Mostrar lista cursos con estudiantes")
        }
    }
}