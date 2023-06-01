package com.example.danp_lab03.model

import androidx.room.Dao
import androidx.room.Insert
import com.example.danp_lab03.entities.CursoEstudianteCrossRef

@Dao
interface CursoEstudianteDao {
    @Insert
    suspend fun insert(cursoEstudianteCrossRef: CursoEstudianteCrossRef)
}