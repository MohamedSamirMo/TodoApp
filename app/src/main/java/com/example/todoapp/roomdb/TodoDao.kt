package com.example.todoapp.roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapp.Todo
import io.reactivex.rxjava3.core.Completable
@Dao
interface TodoDao {
    @Query("SELECT * FROM todo")
    fun getAllTodo(): LiveData<List<Todo>>
    @Insert
    fun insertTodo(todo: Todo)
    @Query("DELETE FROM todo WHERE id = :id")
    fun deleteTodo(id: Int)

}