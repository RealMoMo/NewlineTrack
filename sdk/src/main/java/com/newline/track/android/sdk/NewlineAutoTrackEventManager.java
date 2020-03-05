package com.newline.track.android.sdk;


import android.app.Application;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONObject;

@Keep
public class NewlineAutoTrackEventManager {
    private final String TAG = NewlineAutoTrackEventManager.class.getSimpleName();
    private static final Object mLock = new Object();
    private static NewlineAutoTrackEventManager mInstance;


    @Keep
    public static NewlineAutoTrackEventManager init(Application application){
        synchronized (mLock){
            if(null == mInstance){
                mInstance = new NewlineAutoTrackEventManager(application);
            }
            return mInstance;
        }
    }
    @Keep
    public static NewlineAutoTrackEventManager getInstance(){
        return mInstance;
    }


    private NewlineAutoTrackEventManager(Application application){

    }

    /**
     *
     * @param eventName  事件名称
     * @param content     事件内容
     */
    @Keep
    public void track(@NonNull String eventName,@Nullable JSONObject content){

    }
}
