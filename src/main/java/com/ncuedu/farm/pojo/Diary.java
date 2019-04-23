package com.ncuedu.farm.pojo;

import java.util.Date;

public class Diary {
    private Integer diaryId;

    private Date diaryTime;

    private Integer fieldId;

    private String plantHeight;

    private String fieldState;

    private String insectState;

    private String grassState;

    private Integer plantGrowday;

    private String diaryImg1;

    private String diaryImg2;

    private String diaryImg3;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Date getDiaryTime() {
        return diaryTime;
    }

    public void setDiaryTime(Date diaryTime) {
        this.diaryTime = diaryTime;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getPlantHeight() {
        return plantHeight;
    }

    public void setPlantHeight(String plantHeight) {
        this.plantHeight = plantHeight == null ? null : plantHeight.trim();
    }

    public String getFieldState() {
        return fieldState;
    }

    public void setFieldState(String fieldState) {
        this.fieldState = fieldState == null ? null : fieldState.trim();
    }

    public String getInsectState() {
        return insectState;
    }

    public void setInsectState(String insectState) {
        this.insectState = insectState == null ? null : insectState.trim();
    }

    public String getGrassState() {
        return grassState;
    }

    public void setGrassState(String grassState) {
        this.grassState = grassState == null ? null : grassState.trim();
    }

    public Integer getPlantGrowday() {
        return plantGrowday;
    }

    public void setPlantGrowday(Integer plantGrowday) {
        this.plantGrowday = plantGrowday;
    }

    public String getDiaryImg1() {
        return diaryImg1;
    }

    public void setDiaryImg1(String diaryImg1) {
        this.diaryImg1 = diaryImg1 == null ? null : diaryImg1.trim();
    }

    public String getDiaryImg2() {
        return diaryImg2;
    }

    public void setDiaryImg2(String diaryImg2) {
        this.diaryImg2 = diaryImg2 == null ? null : diaryImg2.trim();
    }

    public String getDiaryImg3() {
        return diaryImg3;
    }

    public void setDiaryImg3(String diaryImg3) {
        this.diaryImg3 = diaryImg3 == null ? null : diaryImg3.trim();
    }

    @Override
    public String toString() {
        return "Diary{" +
                "diaryId=" + diaryId +
                ", diaryTime=" + diaryTime +
                ", fieldId=" + fieldId +
                ", plantHeight='" + plantHeight + '\'' +
                ", fieldState='" + fieldState + '\'' +
                ", insectState='" + insectState + '\'' +
                ", grassState='" + grassState + '\'' +
                ", plantGrowday=" + plantGrowday +
                ", diaryImg1='" + diaryImg1 + '\'' +
                ", diaryImg2='" + diaryImg2 + '\'' +
                ", diaryImg3='" + diaryImg3 + '\'' +
                '}';
    }
}