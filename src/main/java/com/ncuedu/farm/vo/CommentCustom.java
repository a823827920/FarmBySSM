package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Comment;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 11:06
 **/
public class CommentCustom extends Comment {

    private String userName;

    private String userImg;

    private String targetName;

    @Override
    public String toString() {
        return "CommentCustom{" +
                "userName='" + userName + '\'' +
                ", userImg='" + userImg + '\'' +
                ", targetName='" + targetName + '\'' +
                '}';
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}
