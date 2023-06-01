package com.example.danp_lab03.navegation

sealed class Screen(val route: String){
    object MenuScreen: Screen("Menu")
    object AddCursoScreen: Screen("Add Curso")
    object AddEstudianteScreen: Screen("Add Estudiante")
}