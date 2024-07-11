package com.foo.mob21retrofit.data

import com.foo.mob21retrofit.data.apis.Apis
import com.foo.mob21retrofit.data.model.Todo

class TodoRepo(
    private val apis: Apis
) {
    suspend fun getAllTodos(): List<Todo> {
        return apis.getAllTodos()
    }
}