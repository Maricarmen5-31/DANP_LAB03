package com.example.danp_lab03.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun MenuScreen(
    navController: NavController
) {
    val TAG: String = "RoomDatabase"
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.padding(50.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("Add Estudiante") }
        ) {
            Text(text = "Crear Estudiante")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {navController.navigate("Add Curso") }
        ) {
            Text(text = "Crear Curso")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {navController.navigate("Matriculas") }
        ) {
            Text(text = "Matricular Estudiante a un Curso")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("Lista Cursos") }
        ) {
            Text(text = "Mostrar lista cursos con estudiantes")
        }
    }
}