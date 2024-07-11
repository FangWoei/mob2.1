package com.foo.mob21retrofit.data.apis

import com.foo.mob21retrofit.data.model.Todo
import retrofit2.http.GET

// https://jsonplaceholder.typicode.com/todos
interface Apis {
    @GET("/todos")
    suspend fun getAllTodos(): List<Todo>


    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com/todos/"
    }
}