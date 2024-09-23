package com.example.todoapp

import android.annotation.SuppressLint
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Calendar
import java.util.Date
@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    var title: String,
    var createdAt: Date
)

