package com.example.myproject.db

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "paintings")
data class Painting(
    @PrimaryKey val id: Int,
    val title: String,
    val year: Int,
    val history: String,
    val style: String,
    val image: String,
    val authorId: Int
)