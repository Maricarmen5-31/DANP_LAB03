package com.example.danp_lab03.screens.lista

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danp_lab03.entities.CursoWithEstudiantes

@Composable
fun CursoCard(
    curso: CursoWithEstudiantes
){
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(
                start = 8.dp,
                end = 8.dp,
                top = 4.dp,
                bottom = 4.dp
            )
            .fillMaxWidth(),
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Column() {
                Text("Curso ID: ${curso.curso.cursoId.toString()}")
                Text(
                    text = "Curso : ${ curso.curso.nombre }",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold)
                Text("Estudiantes del curso:")

                curso.estudiantes.forEach() {
                    Text("${it.estudianteId} _ ${it.nombre} ${it.apellido}")
                }
            }
        }
    }
}