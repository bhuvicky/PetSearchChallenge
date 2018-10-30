package com.example.petsearchchallenge.dependency.module

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ContextModule(val context: Context) {

    @Provides
    fun getMovieContext(): Context {
        return context
    }
}