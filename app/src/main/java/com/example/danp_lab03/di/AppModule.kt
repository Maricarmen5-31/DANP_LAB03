package com.example.danp_lab03.di

import android.content.Context
import androidx.room.Room
import com.example.danp_lab03.entities.CursoEntity
import com.example.danp_lab03.model.AppDatabase
import com.example.danp_lab03.model.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideAppDatabase(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(context,
        AppDatabase::class.java,
        "app.db"
    ).build()

    @Provides
    fun provideCursoDao(
        appDatabase: AppDatabase
    ) = appDatabase.cursoDao()

    @Provides
    fun provideEstudianteDao(
        appDatabase: AppDatabase
    ) = appDatabase.estudianteDao()

    @Provides
    fun provideCursoEstudianteDao(
        appDatabase: AppDatabase
    ) = appDatabase.cursoEstudianteDao()

    @Provides
    fun provideRepository(
        appDatabase: AppDatabase
    ) = Repository(
        appDatabase = appDatabase
    )
}