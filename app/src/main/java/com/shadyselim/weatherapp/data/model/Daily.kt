package com.shadyselim.weatherapp.data.model

data class Daily(
    var summary: String,
    var icon: String,
    var data: List<Datum>
)
