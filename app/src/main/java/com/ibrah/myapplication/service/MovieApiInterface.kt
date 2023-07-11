package com.ibrah.myapplication.service

import com.ibrah.myapplication.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=4e32ccc78ab21778945ec5876bc9a104")
    fun getMovieList(): Call<MovieResponse>
}