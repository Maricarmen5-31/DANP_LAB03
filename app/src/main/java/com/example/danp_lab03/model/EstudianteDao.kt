package com.example.danp_lab03.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp_lab03.entities.CursoWithEstudiantes
import com.example.danp_lab03.entities.EstudianteEntity
import com.example.danp_lab03.entities.EstudianteWithCursos

@Dao
interface EstudianteDao {
    @Query("SELECT * FROM estudiante")
    suspend fun getEstudiantes(): List<EstudianteEntity>

    @Transaction
    @Query("SELECT * FROM estudiante")
    suspend fun getEstudianteWithCursos(): List<EstudianteWithCursos>

    @Insert
    suspend fun insert(estudianteEntity: EstudianteEntity)

    @Insert
    suspend fun insert(estudianteEntity: List<EstudianteEntity>)

    @Delete
    suspend fun delete(estudianteEntity: EstudianteEntity)
}