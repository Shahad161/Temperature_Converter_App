package com.example.temperature_converter_app

import androidx.lifecycle.*

class MainViewModel: ViewModel(){

    val fahrenheit  = MutableLiveData("32")

    val celsius = Transformations.map(fahrenheit) {
        if (it.isEmpty()){ null }
        else{ convertFahrenheitToCelsius(it) }
    }

    private fun convertFahrenheitToCelsius(value:String):Double{
        return (value.toDouble() - 32) * 5/9
    }

}