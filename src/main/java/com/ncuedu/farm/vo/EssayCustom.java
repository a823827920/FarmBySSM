package com.ncuedu.farm.vo;

import com.ncuedu.farm.pojo.Essay;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:15
 **/
public class EssayCustom extends Essay {

    private String userName;

    private String userImg;

    @Override
    public String toString() {
        return "EssayCustom{" +
                "userName='" + userName + '\'' +
                ", userImg='" + userImg + '\'' +
                '}';
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
