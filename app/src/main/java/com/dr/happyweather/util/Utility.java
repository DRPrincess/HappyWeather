package com.dr.happyweather.util;

import android.text.TextUtils;

import com.dr.happyweather.db.City;
import com.dr.happyweather.db.Country;
import com.dr.happyweather.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 类描述：
 * 作者  : duanrui
 * 时间  ：2017/8/27 0027
 */

public class Utility {

    /**
    * 解析和处理服务器返回省数据
    *@author duanrui
    *create at 2017/8/27 0027 下午 22:21
    */
    public static boolean handleProvinceResponce(String responce){
        if(!TextUtils.isEmpty(responce)){
            try {

                JSONArray allProvince = new JSONArray(responce);
                for(int i=0; i<allProvince.length();i++){
                    JSONObject jsonObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(jsonObject.getInt("id"));
                    province.setProvinceName(jsonObject.getString("name"));
                    province.save();
                }
                return true;

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return  false;
    }

    /**
    * 解析和处理服务器返回市数据
    *@author duanrui
    *create at 2017/8/27 0027 下午 22:31
    */
    public static boolean handleCityResponce(String responce,int provinceId){
        if(!TextUtils.isEmpty(responce)){
            try {

                JSONArray allCity = new JSONArray(responce);
                for(int i=0; i<allCity.length();i++){
                    JSONObject jsonObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(jsonObject.getInt("id"));
                    city.setCityName(jsonObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return  false;
    }

    /**
     * 解析和处理服务器返回县数据
     *@author duanrui
     *create at 2017/8/27 0027 下午 22:31
     */
    public static boolean handleCountryResponce(String responce,int cityId){
        if(!TextUtils.isEmpty(responce)){
            try {

                JSONArray allCountry = new JSONArray(responce);
                for(int i=0; i<allCountry.length();i++){
                    JSONObject jsonObject = allCountry.getJSONObject(i);
                    Country country = new Country();
                    country.setWeatherId(jsonObject.getString("weather_id"));
                    country.setCountryName(jsonObject.getString("name"));
                    country.setCityId(cityId);
                    country.save();
                }
                return true;

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return  false;
    }
}
