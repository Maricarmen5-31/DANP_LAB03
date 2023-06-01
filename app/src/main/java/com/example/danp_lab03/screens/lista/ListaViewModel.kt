package com.example.danp_lab03.screens.lista

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.danp_lab03.entities.CursoWithEstudiantes
import com.example.danp_lab03.model.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListaViewModel
@Inject constructor(
    private val repo: Repository
): ViewModel(){

    var cursoEstudiantes : List<CursoWithEstudiantes> = listOf()

    fun getCursoWithEstudiantes(){
        viewModelScope.launch(Dispatchers.IO){
            cursoEstudiantes = repo.getCursoWithEstudiantes()
        }
    }

}