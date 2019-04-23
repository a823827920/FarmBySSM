package com.ncuedu.farm.pojo;

import java.math.BigDecimal;

public class Plant {
    private Integer plantId;

    private String plantName;

    private Integer plantStock;

    private BigDecimal plantSaleprice;

    private String plantDes;

    private BigDecimal plantOrderprice;

    private Integer cateId;

    private String plantImg;

    private Integer plantFlag;

    private Integer plantSalenum;

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
    }

    public Integer getPlantStock() {
        return plantStock;
    }

    public void setPlantStock(Integer plantStock) {
        this.plantStock = plantStock;
    }

    public BigDecimal getPlantSaleprice() {
        return plantSaleprice;
    }

    public void setPlantSaleprice(BigDecimal plantSaleprice) {
        this.plantSaleprice = plantSaleprice;
    }

    public String getPlantDes() {
        return plantDes;
    }

    public void setPlantDes(String plantDes) {
        this.plantDes = plantDes == null ? null : plantDes.trim();
    }

    public BigDecimal getPlantOrderprice() {
        return plantOrderprice;
    }

    public void setPlantOrderprice(BigDecimal plantOrderprice) {
        this.plantOrderprice = plantOrderprice;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getPlantImg() {
        return plantImg;
    }

    public void setPlantImg(String plantImg) {
        this.plantImg = plantImg == null ? null : plantImg.trim();
    }

    public Integer getPlantFlag() {
        return plantFlag;
    }

    public void setPlantFlag(Integer plantFlag) {
        this.plantFlag = plantFlag;
    }

    public Integer getPlantSalenum() {
        return plantSalenum;
    }

    public void setPlantSalenum(Integer plantSalenum) {
        this.plantSalenum = plantSalenum;
    }
}