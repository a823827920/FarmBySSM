package com.ncuedu.farm.mapper;


import com.ncuedu.farm.util.GetMessageCode;

import java.util.Calendar;
import java.util.Date;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/13 11:41
 **/
public class TestCode {

    public static void main(String[] args) {
        /*String phone = "13703922842";
        String code = GetMessageCode.getCode(phone);
        System.out.println(code);*/
        Date date=new Date();
        System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
