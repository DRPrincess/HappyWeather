package com.dr.happyweather.db;

import org.litepal.crud.DataSupport;

/**
 * 类描述：省表
 * 作者  : duanrui
 * 时间  ：2017/8/24 0024
 */

public class Province extends DataSupport{
    private int id;
    private int provinceCode;
    private String provinceName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
