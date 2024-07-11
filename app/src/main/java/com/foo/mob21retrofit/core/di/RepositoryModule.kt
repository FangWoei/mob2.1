package com.foo.mob21retrofit.core.di

import com.foo.mob21retrofit.data.TodoRepo
import com.foo.mob21retrofit.data.apis.Apis
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideTodoRepo(apis: Apis): TodoRepo {
        return TodoRepo(apis)
    }
}