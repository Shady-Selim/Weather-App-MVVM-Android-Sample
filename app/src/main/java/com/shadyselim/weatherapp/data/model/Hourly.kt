package com.shadyselim.weatherapp.data.model

data class Hourly(
    var summary: String,
    var icon: String,
    var data: List<Datum>
)