package com.example.danp_lab03.entities

import androidx.room.Entity

@Entity(primaryKeys = ["cursoId", "estudianteId"])
data class CursoEstudianteCrossRef (
    val cursoId: Int,
    val estudianteId: Int
)