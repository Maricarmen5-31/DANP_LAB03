package com.example.danp_lab03.screens.estudiante

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.danp_lab03.screens.curso.AddCursoViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddEstudianteScreen(
    navController: NavController,
    viewModel: AddEstudianteViewModel = hiltViewModel()
){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Text(
            text = "Agregar Estudiante",
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        OutlinedTextField(
            value = viewModel.nombre,
            onValueChange = { viewModel.nombre = it },
            label = { Text("Nombre:") }
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        OutlinedTextField(
            value = viewModel.apellido,
            onValueChange = { viewModel.apellido = it },
            label = { Text("Apellido:") }
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        Button(
            onClick = {
                //updateMascota(mascota)
                //navigateBack()
            }
        ){
            Text("Crear Estudiante")
        }
    }
}