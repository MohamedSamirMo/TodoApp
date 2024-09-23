package com.example.todoapp.roomdb

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date

class Converts {
    @TypeConverter
    fun fromData(date: Date): Long{
        return date.time
    }
    @TypeConverter
    fun toData(time: Long): Date{
        return Date(time)


    }

}