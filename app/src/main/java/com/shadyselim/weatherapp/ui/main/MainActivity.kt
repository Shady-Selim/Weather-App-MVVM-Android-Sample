package com.shadyselim.weatherapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.shadyselim.weatherapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by lazy {
        ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.getWeather("${getString(R.string.lat)},${getString(R.string.longe)}").observe(this,{
            tv_timezone.text = it.timezone
            tv_temperature.text = getString(R.string.temp, it.currently.temperature.roundToInt().toString())
            tv_daily_summary.text = it.daily.summary
            tv_current_summary.text = it.currently.summary
            tv_apparentTemperature.text = getString(R.string.feels_like, it.currently.apparentTemperature.roundToInt().toString())
            tv_temperatureHigh.text = getString(R.string.high, ceil(it.daily.data[0].temperatureHigh).toString())
            tv_temperatureLow.text = getString(R.string.low, floor(it.daily.data[0].temperatureLow).toString())
            iv_icon.load("https://darksky.net/images/weather-icons/${it.currently.icon}.png")
        })
    }
}