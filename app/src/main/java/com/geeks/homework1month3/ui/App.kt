package com.geeks.homework1month3.ui

import android.app.Application
import androidx.room.Room
import com.geeks.homework1month3.data.local.room.AppDatabase

class App: Application() {

    companion object{
        lateinit var db: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(applicationContext, AppDatabase:: class.java, "notes_data")
            .allowMainThreadQueries().build()
    }
}