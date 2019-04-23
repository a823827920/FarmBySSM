package com.ncuedu.farm.pojo;

import java.util.Date;

public class Roomitem {
    private Integer itemId;

    private Integer plantId;

    private Integer fieldId;

    private Integer userId;

    private Byte itemFlag;

    private Date itemDate;

    private Date itemStart;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getItemFlag() {
        return itemFlag;
    }

    public void setItemFlag(Byte itemFlag) {
        this.itemFlag = itemFlag;
    }

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public Date getItemStart() {
        return itemStart;
    }

    public void setItemStart(Date itemStart) {
        this.itemStart = itemStart;
    }

    @Override
    public String toString() {
        return "Roomitem{" +
                "itemId=" + itemId +
                ", plantId=" + plantId +
                ", fieldId=" + fieldId +
                ", userId=" + userId +
                ", itemFlag=" + itemFlag +
                ", itemDate=" + itemDate +
                ", itemStart=" + itemStart +
                '}';
    }
}