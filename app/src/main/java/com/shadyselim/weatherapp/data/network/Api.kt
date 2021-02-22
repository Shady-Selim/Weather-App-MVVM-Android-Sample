package com.shadyselim.weatherapp.data.network

import com.shadyselim.weatherapp.data.model.Weather
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("forecast/2bb07c3bece89caf533ac9a5d23d8417/{location}")
    suspend fun getWeatherAsync(@Path("location") gLocation: String): Weather //59.337239,18.062381
}
