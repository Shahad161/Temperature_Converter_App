package com.example.temperature_converter_app

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["setColorOnTemperatureChange"])
fun setTemperatureColor(view: View, temperature: String?) {
    temperature?.toDouble()?.let {
        view.setBackgroundColor(
            when {
                it in 0.0..20.0 -> view.context.getColor(R.color.green)
                it in 21.0..30.0 -> view.context.getColor(R.color.yellow)
                it in 31.0..40.0 -> view.context.getColor(R.color.orange)
                it >= 41.0 -> view.context.getColor(R.color.red)
                else -> view.context.getColor(R.color.blue)
            }
        )
    }

}

