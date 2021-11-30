package com.example.myweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myweather.ui.main.TodayWeatherFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TodayWeatherFragment.newInstance())
                .commitNow()
        }
    }
}