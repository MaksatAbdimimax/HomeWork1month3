package com.geeks.homework1month3.data.local

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("onboard_prefs", Context.MODE_PRIVATE)

    fun isOnBoardShown(): Boolean {
        return prefs.getBoolean("onboard_shown", false)
    }

    fun setOnBoardShown() {
        prefs.edit().putBoolean("onboard_shown", true).apply()
    }
}