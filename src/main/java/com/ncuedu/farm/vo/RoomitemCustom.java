package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Roomitem;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 15:48
 **/
public class RoomitemCustom extends Roomitem {

    private String plantName;

    private String userName;

    private String fieldLoc;

    private String itemLoc;

    public String getItemLoc() {
        return itemLoc;
    }

    public void setItemLoc(String itemLoc) {
        this.itemLoc = itemLoc;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFieldLoc() {
        return fieldLoc;
    }

    public void setFieldLoc(String fieldLoc) {
        this.fieldLoc = fieldLoc;
    }

    @Override
    public String toString() {
        return "RoomitemCustom{" +
                "plantName='" + plantName + '\'' +
                ", userName='" + userName + '\'' +
                ", fieldLoc='" + fieldLoc + '\'' +
                ", itemLoc='" + itemLoc + '\'' +
                '}';
    }
}
