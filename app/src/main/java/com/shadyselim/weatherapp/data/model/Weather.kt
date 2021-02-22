package com.shadyselim.weatherapp.data.model

data class Weather(
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val currently: Currently,
    val hourly: Hourly?,
    val daily: Daily,
    val alerts: List<Alert>?,
    val flags: Flags?,
    val offset: Int?
)