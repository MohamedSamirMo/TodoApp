package com.example.todoapp.roomdb


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoapp.Todo

@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converts::class)

abstract class TodoDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "todo_database"

    }
    abstract fun getTodoDao(): TodoDao


}