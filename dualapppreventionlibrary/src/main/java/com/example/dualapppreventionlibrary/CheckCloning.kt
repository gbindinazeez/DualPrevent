package com.example.dualapppreventionlibrary

import android.app.Activity
import android.content.Context
import android.util.Log
import kotlin.system.exitProcess

object CheckCloning {

    private const val packageDotsNumbers = 3

    fun checkAppCloning(
        context: Context,
        onAppCloned: () -> Unit,   // what to do when the app is cloned
        onAppNotCloned: () -> Unit // what to do when the app is genuine cloned
    ) {
        val path: String = context.filesDir?.path ?: ""
        Log.d("path", path)
        if (path.contains("999")) {
            onAppCloned()
        } else {
            val count = getDotCount(path)
            if (count > packageDotsNumbers) {
                onAppCloned()
            } else {
                onAppNotCloned()
            }
        }
    }

    private fun getDotCount(path: String): Int {
        val delimiter = "."
        val length = path.split(delimiter).size

        return length - 1
    }

    // This function closes the app
    fun killProcess(activity: Activity) {
        activity.finish()
        android.os.Process.killProcess(android.os.Process.myPid())
        exitProcess(0)
    }

}