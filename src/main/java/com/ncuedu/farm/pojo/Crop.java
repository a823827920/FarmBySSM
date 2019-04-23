package com.ncuedu.farm.pojo;

public class Crop {
    private Integer cropId;

    private Integer plantId;

    private Double cropWeight;

    private Integer userId;

    public Integer getCropId() {
        return cropId;
    }

    public void setCropId(Integer cropId) {
        this.cropId = cropId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public Double getCropWeight() {
        return cropWeight;
    }

    public void setCropWeight(Double cropWeight) {
        this.cropWeight = cropWeight;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "cropId=" + cropId +
                ", plantId=" + plantId +
                ", cropWeight=" + cropWeight +
                ", userId=" + userId +
                '}';
    }
}