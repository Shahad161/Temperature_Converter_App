package com.example.temperature_converter_app

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["setOnTemperatureChange"])
fun setTemperature(view: View, temperature: String?) {

    temperature?.toDouble()?.apply {
        view.setBackgroundColor(
            when {
                this in 0.0..20.0 -> view.context.getColor(R.color.green)
                this in 21.0..30.0 -> view.context.getColor(R.color.yellow)
                this in 31.0..40.0 -> view.context.getColor(R.color.orange)
                this >= 41.0 -> view.context.getColor(R.color.red)
                else -> view.context.getColor(R.color.blue)
            }
        )
    }

}

