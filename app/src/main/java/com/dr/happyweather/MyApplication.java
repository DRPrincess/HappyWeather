package com.dr.happyweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * 类描述：
 * 作者  : duanrui
 * 时间  ：2017/8/24 0024
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
