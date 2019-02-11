package com.kplayout2019

import android.app.Activity
import android.content.Intent
import android.util.Log
import com.kplayout2019.screen.IntroPrivacyPolicy

object ManagerLayout {
    private lateinit var nameClass: Class<*>
    private lateinit var nameClassLiveWall: Class<*>
    private var instance: ManagerLayout? = null

    fun getInstance(): ManagerLayout {
        if (instance == null) {
            Log.d("asdfasdf", "if")
            return ManagerLayout
        } else {
            Log.d("asdfasdf", "else")
            return instance as ManagerLayout
        }
    }

    fun redirect(activity: Activity, redirectApplyBtn: Class<*>,redirectLiveWallBtn: Class<*>) {
        nameClass = redirectApplyBtn
        nameClassLiveWall = redirectLiveWallBtn
        Log.d("afwef", " redirect" + redirectApplyBtn)
        activity.startActivity(Intent(activity, IntroPrivacyPolicy::class.java))
        activity.finish()
    }

    fun getMyClass(): Class<*> {
        return nameClass
    }

    fun getLiveWallClass():Class<*>{
        return nameClassLiveWall
    }




}