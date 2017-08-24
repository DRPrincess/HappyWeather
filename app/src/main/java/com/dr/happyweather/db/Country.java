package com.dr.happyweather.db;

/**
 * 类描述：县表
 * 作者  : duanrui
 * 时间  ：2017/8/24 0024
 */

public class Country {


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
}
