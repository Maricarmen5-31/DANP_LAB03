package com.example.danp_lab03.screens.estudiante

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.danp_lab03.entities.EstudianteEntity
import com.example.danp_lab03.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddEstudianteViewModel
@Inject constructor(
    private val repo: Repository
): ViewModel(){
    var nombre by mutableStateOf("")
    var apellido by mutableStateOf("")

    fun addEstudiante() {
        viewModelScope.launch(Dispatchers.IO){
            repo.insertEstudiante(EstudianteEntity(0, nombre, apellido))
        }
    }
}