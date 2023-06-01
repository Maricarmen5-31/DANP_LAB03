package com.example.danp_lab03.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.danp_lab03.entities.CursoEntity
import com.example.danp_lab03.entities.CursoWithEstudiantes

@Dao
interface CursoDao {
    @Query("SELECT * FROM curso")
    suspend fun getCursos(): List<CursoEntity>

    @Transaction
    @Query("SELECT * FROM curso")
    suspend fun getCursoWithEstudiantes(): List<CursoWithEstudiantes>

    @Insert
    suspend fun insert(cursoEntity: CursoEntity)

    @Insert
    suspend fun insert(cursoEntity: List<CursoEntity>)

    @Delete
    suspend fun delete(cursoEntity: CursoEntity)

}