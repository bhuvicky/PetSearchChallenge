package com.example.petsearchchallenge.dependency.component

import com.example.petsearchchallenge.datasource.MovieDataSource
import com.example.petsearchchallenge.dependency.module.ContextModule
import com.example.petsearchchallenge.dependency.module.NetworkModule
import com.example.petsearchchallenge.dependency.scope.MovieScope
import dagger.Component

@MovieScope
@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun inject(dataSource: MovieDataSource)
}