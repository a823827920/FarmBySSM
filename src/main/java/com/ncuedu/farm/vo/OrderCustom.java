package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Order;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 14:46
 **/
public class OrderCustom extends Order {

    private String plantName;

    private Integer cropWeight;

    @Override
    public String toString() {
        return "OrderCustom{" +
                "plantName='" + plantName + '\'' +
                ", cropWeight=" + cropWeight +
                '}';
    }
}
