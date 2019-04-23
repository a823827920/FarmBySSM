package com.ncuedu.farm.pojo;

public class Essay {
    private Integer essayId;

    private String essayTitle;

    private Integer userId;

    private String essayContent;

    private Integer praiseNum;

    private String essayImg1;

    private String essayImg2;

    private String essayImg3;

    private String essayImg4;

    public Integer getEssayId() {
        return essayId;
    }

    public void setEssayId(Integer essayId) {
        this.essayId = essayId;
    }

    public String getEssayTitle() {
        return essayTitle;
    }

    public void setEssayTitle(String essayTitle) {
        this.essayTitle = essayTitle == null ? null : essayTitle.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEssayContent() {
        return essayContent;
    }

    public void setEssayContent(String essayContent) {
        this.essayContent = essayContent == null ? null : essayContent.trim();
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public String getEssayImg1() {
        return essayImg1;
    }

    public void setEssayImg1(String essayImg1) {
        this.essayImg1 = essayImg1 == null ? null : essayImg1.trim();
    }

    public String getEssayImg2() {
        return essayImg2;
    }

    public void setEssayImg2(String essayImg2) {
        this.essayImg2 = essayImg2 == null ? null : essayImg2.trim();
    }

    public String getEssayImg3() {
        return essayImg3;
    }

    public void setEssayImg3(String essayImg3) {
        this.essayImg3 = essayImg3 == null ? null : essayImg3.trim();
    }

    public String getEssayImg4() {
        return essayImg4;
    }

    public void setEssayImg4(String essayImg4) {
        this.essayImg4 = essayImg4 == null ? null : essayImg4.trim();
    }
}