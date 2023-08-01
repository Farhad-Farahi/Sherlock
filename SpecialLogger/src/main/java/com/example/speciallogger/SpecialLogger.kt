package com.example.speciallogger

import android.util.Log

object SpecialLogger {

    fun logSpecial(text : String){
        Log.d("logSpecial", "logSpecial: $text")
    }
}