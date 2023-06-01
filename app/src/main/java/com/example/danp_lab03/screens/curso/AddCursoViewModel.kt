package com.example.danp_lab03.screens.curso

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.danp_lab03.entities.CursoEntity
import com.example.danp_lab03.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddCursoViewModel
@Inject constructor(
    private val repo: Repository
): ViewModel() {
    var nombre by mutableStateOf("")

    fun addCurso() {
        viewModelScope.launch(Dispatchers.IO){
            repo.insertCurso(CursoEntity(0, nombre))
        }
    }
}