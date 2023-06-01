package com.example.danp_lab03.entities

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class EstudianteWithCursos (
    @Embedded
    val estudiante: EstudianteEntity,
    @Relation(
        parentColumn = "estudianteId",
        entityColumn = "cursoId",
        associateBy = Junction(CursoEstudianteCrossRef::class)
    )
    val cursos: List<CursoEntity>
)