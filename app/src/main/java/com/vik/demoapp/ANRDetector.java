package com.vik.demoapp;

import android.app.Application;
import android.util.Log;

public class ANRDetector extends Application {

    private static final String TAG = "ANRDetector";
    @Override
    public void onCreate() {
        super.onCreate();
        new ANRWatcher().setANRListener(new ANRWatcher.ANRListener() {
            @Override
            public void onAppNotResponding(ANRError error) {

                Log.d(TAG, "onAppNotResponding: "+error);

            }
        }).start();
    }
}
