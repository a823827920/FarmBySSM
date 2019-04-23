package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Field;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 19:55
 **/
public interface FieldService {

    List<Field> queryFieldByLoc(String loc);

    Integer updateFieldById(Field field);


}
