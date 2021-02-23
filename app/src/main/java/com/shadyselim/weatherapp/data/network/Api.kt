package com.shadyselim.weatherapp.data.network

import com.shadyselim.weatherapp.BuildConfig
import com.shadyselim.weatherapp.data.model.Weather
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("forecast/${BuildConfig.Weather_Api_Key}/{location}")
    suspend fun getWeatherAsync(@Path("location") gLocation: String): Weather //59.337239,18.062381
}
