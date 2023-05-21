package com.example.myproject.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PaintingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(paintings: List<Painting>)

    @Query("SELECT * FROM paintings")
    fun getAllPaintings(): List<Painting>
}


