package com.example.todoapp

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date

class TodoViewModel(): ViewModel() {
    val todo=MainAppliaction.todoDatabase.getTodoDao()
    val todoList: LiveData<List<Todo>> = todo.getAllTodo()


    fun addListTodo(title: String){
        viewModelScope.launch(Dispatchers.IO) {

            todo.insertTodo(Todo(title = title, createdAt = Date.from(Instant.now())))
        }    }
    fun deleteListTodo(id: Int){
        viewModelScope.launch(Dispatchers.IO) {
            todo.deleteTodo(id)
        }


    }

}