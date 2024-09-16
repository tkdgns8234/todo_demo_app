package com.example.todo_demo_app.dto

data class CreateTodoDTO(
    var title: String,

    var description: String? = null,

    var completed: Boolean = false,

    val userId: Long
)