package com.example.todoapp

import android.app.Application
import androidx.room.Room
import com.example.todoapp.roomdb.TodoDatabase

class MainAppliaction : Application()  {
    companion object {
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
      todoDatabase= Room.databaseBuilder(applicationContext,
            TodoDatabase::class.java, TodoDatabase.DATABASE_NAME).build()
    }
}