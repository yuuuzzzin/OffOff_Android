package com.yuuuzzzin.offoff_android.service

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class SharedPreferenceController(context: Context) {

    private val TOKEN = "TOKEN"

    private val pref: SharedPreferences =
        context.getSharedPreferences(TOKEN, MODE_PRIVATE)

    var token: String?
        get() = pref.getString("token", null)
        set(value) {
            pref.edit().putString("token", value).apply()
        }

    fun deleteToken() {
        val edit = pref.edit()
        edit.clear()
        edit.apply()
    }

}