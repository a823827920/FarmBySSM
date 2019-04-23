package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Essay;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:11
 **/
public interface EssayService {

    Essay queryEssayById(Integer id);

    Integer updateEssayById(Essay essay);
}
