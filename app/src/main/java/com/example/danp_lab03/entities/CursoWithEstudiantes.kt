package com.example.danp_lab03.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class CursoWithEstudiantes (
    @Embedded
    val curso: CursoEntity,
    @Relation(
        parentColumn = "cursoId",
        entityColumn = "estudianteId",
        associateBy = Junction(CursoEstudianteCrossRef::class)
    )
    val estudiantes: List<EstudianteEntity>
)