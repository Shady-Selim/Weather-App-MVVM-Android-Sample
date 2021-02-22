package com.shadyselim.weatherapp.data.repo

import com.shadyselim.weatherapp.data.model.Weather
import com.shadyselim.weatherapp.data.network.Api
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainRepo(val api: Api) {
    suspend fun getWeather(gLocation: String): Weather = withContext(Dispatchers.IO) {
        api.getWeatherAsync(gLocation)
    }
}