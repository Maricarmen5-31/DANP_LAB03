package com.example.danp_lab03.screens.lista

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun ListaScreen (
    navController: NavController,
    viewModel: ListaViewModel = hiltViewModel()
){
    viewModel.getCursoWithEstudiantes()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ){
        items(viewModel.cursoEstudiantes){
                curso->
            CursoCard(
                curso = curso
            )
        }
    }
}