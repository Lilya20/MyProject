package com.example.myproject.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "authors")
data class Author(
    @PrimaryKey val id: Int,
    val name: String,
    val birthYear: Int,
    val authorFact: String
)