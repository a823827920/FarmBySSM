package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Plant;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 17:53
 **/
public class PlantCustom extends Plant {

    private String cateName;

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "PlantCustom{" +
                "cateName='" + cateName + '\'' +
                '}';
    }
}
