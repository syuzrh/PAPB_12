package com.example.papb_12.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @NonNull
    val id: Int = 0,
    @ColumnInfo(name = "title")
    val title: String = "",  // Menambahkan nilai default untuk title
    @ColumnInfo(name = "description")
    val description: String = "",
    @ColumnInfo(name = "date")
    val date: String = ""
)

