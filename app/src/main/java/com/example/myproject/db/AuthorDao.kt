package com.example.myproject.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AuthorDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(authors: List<Author>)

    @Query("SELECT * FROM authors")
    fun getAllAuthors(): List<Author>
}