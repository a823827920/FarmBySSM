package com.ncuedu.farm.pojo;

public class Cate {
    private Integer cateId;

    private String cateName;

    private Integer parentId;

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cateId=" + cateId +
                ", cateName='" + cateName + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}