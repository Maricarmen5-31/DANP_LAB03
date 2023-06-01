package com.example.danp_lab03.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "estudiante")
data class EstudianteEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "estudianteId")
    val estudianteId: Int,

    @ColumnInfo(name = "nombre")
    val nombre: String,

    @ColumnInfo(name = "apellido")
    val apellido: String
)