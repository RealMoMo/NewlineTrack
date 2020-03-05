package com.newline.track

import android.app.Application
import com.newline.track.android.sdk.NewlineAutoTrackEventManager

class TrackApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        NewlineAutoTrackEventManager.init(this)
    }
}