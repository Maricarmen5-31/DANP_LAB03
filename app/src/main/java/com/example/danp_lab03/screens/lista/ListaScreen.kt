package com.example.danp_lab03.screens.lista

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun ListaScreen (
    navController: NavController,
    viewModel: ListaViewModel = hiltViewModel()
){
    viewModel.getCursoWithEstudiantes()
    Column() {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ){
            items(viewModel.cursoEstudiantes){
                    curso->
                CursoCard(
                    curso = curso
                )
            }
        }
        Button(
            modifier = Modifier.padding(10.dp).align(CenterHorizontally),
            onClick = {
                navController.navigate("MenuScreen")
            }
        ){
            Text("Regresar al Menu")
        }
    }
}