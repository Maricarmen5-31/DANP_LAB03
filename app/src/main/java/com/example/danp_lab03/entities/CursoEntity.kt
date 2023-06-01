package com.example.danp_lab03.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "curso")
data class CursoEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cursoId")
    val cursoId: Int,

    @ColumnInfo(name = "nombre")
    val nombre: String
)