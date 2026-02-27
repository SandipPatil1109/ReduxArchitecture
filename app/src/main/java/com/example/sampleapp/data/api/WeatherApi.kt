package com.example.sampleapp.data.api

import com.example.sampleapp.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getWeather(@Query("city") city: String): WeatherResponse
}