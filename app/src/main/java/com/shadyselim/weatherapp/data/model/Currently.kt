package com.shadyselim.weatherapp.data.model

data class Currently(
    val time: Int,
    val summary: String,
    val icon: String,
    val precipIntensity: Double?,
    val precipProbability: Double?,
    val precipType: String?,
    val precipAccumulation: Double?,
    val temperature: Double,
    val apparentTemperature: Double,
    val dewPoint: Double?,
    val humidity: Double?,
    val pressure: Double?,
    val windSpeed: Double?,
    val windGust: Double?,
    val windBearing: Double?,
    val cloudCover: Double?,
    val uvIndex: Int?,
    val visibility: Double?,
    val ozone: Double?,
)