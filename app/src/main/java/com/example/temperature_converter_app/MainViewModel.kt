package com.example.temperature_converter_app

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import kotlinx.coroutines.flow.MutableStateFlow


class MainViewModel: ViewModel(){

    var fahrenheit  = MutableLiveData<String>()

    private var convertTemperature  = fahrenheit.map {
        if (it.isEmpty()){ null }
        else{ convertFahrenheitToCelsius(it) }
    }

    var celsius = MutableStateFlow(convertTemperature)


    private fun convertFahrenheitToCelsius(value:String):Double{
        return (value.toDouble() - 32) * 5/9
    }

}