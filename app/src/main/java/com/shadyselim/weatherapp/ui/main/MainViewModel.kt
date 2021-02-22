package com.shadyselim.weatherapp.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shadyselim.weatherapp.data.model.Weather
import com.shadyselim.weatherapp.data.network.ApiBuilder
import com.shadyselim.weatherapp.data.repo.MainRepo
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel: ViewModel() {
    private val repo: MainRepo = MainRepo(ApiBuilder.retrofitApi)

    val weather: MutableLiveData<Weather> by lazy {
        MutableLiveData<Weather>()
    }

    fun getWeather(gLocation: String): MutableLiveData<Weather> {

        viewModelScope.launch {
            try {
                weather.postValue(repo.getWeather(gLocation))
            } catch (ex: Exception) {
                Log.e("Get Weather:", ex.message.toString())
            }
        }
        return weather
    }

}