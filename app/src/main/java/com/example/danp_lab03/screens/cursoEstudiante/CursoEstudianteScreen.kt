package com.example.danp_lab03.screens.cursoEstudiante

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CursoEstudianteScreen(
    navController: NavController,
    viewModel: CursoEstudianteViewModel = hiltViewModel()
){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Text(
            text = "Matricula",
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        OutlinedTextField(
            value = viewModel.idCurso,
            onValueChange = { viewModel.idCurso = it },
            label = { Text("ID del curso:") }
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        OutlinedTextField(
            value = viewModel.idEstudiante,
            onValueChange = { viewModel.idEstudiante = it },
            label = { Text("ID del estudiante:") }
        )
        Spacer(
            modifier = Modifier.height(20.dp)
        )
        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Button(
                modifier = Modifier.padding(10.dp),
                onClick = {
                    navController.navigate("MenuScreen")
                }
            ){
                Text("Cancelar")
            }
            Button(
                modifier = Modifier.padding(10.dp),
                onClick = {
                    viewModel.addMatricula()
                    navController.navigate("MenuScreen")
                }
            ){
                Text("Matricular")
            }
        }
        Spacer(
            modifier = Modifier.height(50.dp)
        )
    }
}