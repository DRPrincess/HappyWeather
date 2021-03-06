package com.dr.happyweather.db;

import org.litepal.crud.DataSupport;

/**
 * 类描述：县表
 * 作者  : duanrui
 * 时间  ：2017/8/24 0024
 */

public class Country extends DataSupport{


    private int id;
    private int cityId;
    private String countryName;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
