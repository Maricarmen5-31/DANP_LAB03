package com.example.danp_lab03.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.danp_lab03.screens.MenuScreen
import com.example.danp_lab03.screens.curso.AddCursoScreen
import com.example.danp_lab03.screens.estudiante.AddEstudianteScreen
import com.example.danp_lab03.screens.lista.ListaScreen

@Composable
fun NavGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination =  "MenuScreen" ){
        composable("MenuScreen") { MenuScreen(navController) }
        composable("Add Curso") { AddCursoScreen(navController) }
        composable("Add Estudiante") { AddEstudianteScreen(navController) }
        composable("Lista Cursos") { ListaScreen(navController) }

    }
}