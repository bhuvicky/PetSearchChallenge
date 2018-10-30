package com.example.petsearchchallenge.dependency.module

import com.example.petsearchchallenge.Constant.Constant
import com.example.petsearchchallenge.datasource.MovieOperation
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun retrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(Constant.NetworkUrl.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides
    fun movieOperation(retrofit: Retrofit): MovieOperation {
        return retrofit.create(MovieOperation::class.java)
    }
}