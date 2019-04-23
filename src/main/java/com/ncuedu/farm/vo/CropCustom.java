package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Crop;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 14:20
 **/
public class CropCustom extends Crop {

    private String plantName;

    private String plantDes;

    private String plantImg;

    public String getPlantDes() {
        return plantDes;
    }

    public void setPlantDes(String plantDes) {
        this.plantDes = plantDes;
    }

    public String getPlantImg() {
        return plantImg;
    }

    public void setPlantImg(String plantImg) {
        this.plantImg = plantImg;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    @Override
    public String toString() {
        return "CropCustom{" +
                "plantName='" + plantName + '\'' +
                ", plantDes='" + plantDes + '\'' +
                ", plantImg='" + plantImg + '\'' +
                '}';
    }
}
