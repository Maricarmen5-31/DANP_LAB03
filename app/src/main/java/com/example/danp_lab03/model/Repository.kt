package com.example.danp_lab03.model

import com.example.danp_lab03.entities.CursoEntity
import com.example.danp_lab03.entities.CursoWithEstudiantes
import com.example.danp_lab03.entities.EstudianteEntity
import com.example.danp_lab03.entities.EstudianteWithCursos

class Repository(
    private val appDatabase: AppDatabase
) {
    suspend fun getAllCursos(): List<CursoEntity> {
        return appDatabase.cursoDao().getCursos()
    }

    suspend fun getAllEstudiantes(): List<EstudianteEntity> {
        return appDatabase.estudianteDao().getEstudiantes()
    }

    suspend fun getCursoWithEstudiantes(): List<CursoWithEstudiantes> {
        return appDatabase.cursoDao().getCursoWithEstudiantes()
    }

    suspend fun getEstudianteWithCursos(): List<EstudianteWithCursos> {
        return appDatabase.estudianteDao().getEstudianteWithCursos()
    }

    suspend fun insertCursos(cusos: List<CursoEntity>) {
        return appDatabase.cursoDao().insert(cusos)
    }

    suspend fun insertEstudiantes(estudiantes: List<EstudianteEntity>) {
        return appDatabase.estudianteDao().insert(estudiantes)
    }

    suspend fun insertCurso(curso: CursoEntity){
        return appDatabase.cursoDao().insert(curso)
    }

    suspend fun insertEstudiante(estudiante: EstudianteEntity) {
        return appDatabase.estudianteDao().insert(estudiante)
    }

}