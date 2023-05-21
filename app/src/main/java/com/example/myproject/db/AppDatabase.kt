package com.example.myproject.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Painting::class, Author::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun paintingDao(): PaintingDao
    abstract fun authorDao(): AuthorDao

    companion object {
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java, "app_database"
                    ).build()
                }
            }
            return INSTANCE!!
        }
    }
}
