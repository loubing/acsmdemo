package com.sheyuan.util;

import android.widget.Toast;

/**
 * Created by loub on 2017/9/19.
 */

public class ToastUtil {

    public static void show(String msg) {
        Toast.makeText(MyApp.mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
