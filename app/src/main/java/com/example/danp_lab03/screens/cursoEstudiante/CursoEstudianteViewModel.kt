package com.example.danp_lab03.screens.cursoEstudiante

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.danp_lab03.entities.CursoEstudianteCrossRef
import com.example.danp_lab03.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CursoEstudianteViewModel
@Inject constructor(
    private val repo: Repository
): ViewModel() {

    var idCurso by mutableStateOf("")
    var idEstudiante by mutableStateOf("")

    fun addMatricula() {
        viewModelScope.launch(Dispatchers.IO){
            repo.insertCursoEstudiante(CursoEstudianteCrossRef(idCurso, idEstudiante))
        }
    }
}