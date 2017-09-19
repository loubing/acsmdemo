package com.sheyuan.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by loub on 2017/9/19.
 */

public class MyApp extends Application {
    
    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;
    }
}
