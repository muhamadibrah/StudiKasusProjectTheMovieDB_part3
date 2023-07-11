package com.ibrah.myapplication.service

import com.ibrah.myapplication.model.MovieResponse
import com.ibrah.myapplication.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TvApiInterface {
    @GET("/3/tv/popular?api_key=4e32ccc78ab21778945ec5876bc9a104")
    fun getTVList(): Call<TVResponse>
}