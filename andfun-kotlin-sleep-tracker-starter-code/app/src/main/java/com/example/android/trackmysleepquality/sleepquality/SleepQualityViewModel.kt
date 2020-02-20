package com.example.android.trackmysleepquality.sleepquality

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.android.trackmysleepquality.database.SleepDatabase

class SleepQualityViewModel (
        val database: SleepDatabase,
        application: Application
) : AndroidViewModel(application){

}