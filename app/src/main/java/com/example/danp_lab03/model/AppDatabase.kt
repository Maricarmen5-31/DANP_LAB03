package com.example.danp_lab03.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.danp_lab03.entities.CursoEntity
import com.example.danp_lab03.entities.CursoEstudianteCrossRef
import com.example.danp_lab03.entities.EstudianteEntity

@Database(
    entities = [EstudianteEntity::class, CursoEntity::class, CursoEstudianteCrossRef::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase(){
    abstract fun estudianteDao(): EstudianteDao
    abstract fun cursoDao(): CursoDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "database-name"
                    ).fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}