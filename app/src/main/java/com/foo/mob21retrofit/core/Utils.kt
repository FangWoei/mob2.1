package com.foo.mob21retrofit.core

import android.util.Log

object Utils {
    fun <T> debugLog(tag: String = "debugging"): (T) -> Unit {
        return {
            Log.d(tag, it.toString())
        }
    }
}