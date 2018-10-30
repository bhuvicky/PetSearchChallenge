package com.example.petsearchchallenge.datasource

import com.example.petsearchchallenge.dependency.component.DaggerNetworkComponent
import com.example.petsearchchallenge.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Inject

interface MovieOperation {

    @GET("discover/movie?")
    fun fetchMovieList(@Query("api_key") key: String,
                       @Query("sort_by") sortBy: String): Call<List<Movie>>

    @GET("movie/{movie_id}?")
    fun fetchMovieDetails(@Path("movie_id") movieId: Long, @Query("api_key") key: String)
}

class MovieDataSource {

    @Inject
    lateinit var operation: MovieOperation

    init {
        DaggerNetworkComponent.builder().build().inject(this)
    }

}