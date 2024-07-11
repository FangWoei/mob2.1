package com.foo.mob21retrofit

import android.app.Application
import android.util.Log
import com.foo.mob21retrofit.core.Utils.debugLog
import com.foo.mob21retrofit.data.TodoRepo
import com.foo.mob21retrofit.data.apis.Apis
import dagger.hilt.android.HiltAndroidApp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Inject

@HiltAndroidApp
class MyApp: Application() {
    lateinit var repo: TodoRepo



    override fun onCreate() {
        super.onCreate()

//        Log.d("Debugging", BuildConfig.BASE_URL)

        val todosApi = Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Apis::class.java)


        repo = TodoRepo(todosApi)
    }
}