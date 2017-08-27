package com.dr.happyweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 类描述：
 * 作者  : duanrui
 * 时间  ：2017/8/27 0027
 */

public class HttpUtils {
    public void sendOKHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
