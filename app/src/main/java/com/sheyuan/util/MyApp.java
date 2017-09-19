package com.sheyuan.util;

import android.content.Context;

/**
 * Created by loub on 2017/9/19.
 */

public class MyApp {

    public static Context mAppContext=null;
    public static String cacheDir; //sdk缓存路径


    public static void init(Context context){
        mAppContext = context;
//        SyLogUtil.e("xiaoma","sdk线程"+Thread.currentThread().getName()+"/"+Thread.currentThread().getId());
//        SyLogUtil.e("xiaoma","sdk进程"+Process.myPid()+"/"+Process.myUid());
        cacheDir = mAppContext.getCacheDir().toString();
    }

    public static Context getContext() {
        return mAppContext;
    }
}
