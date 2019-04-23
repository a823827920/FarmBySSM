package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.EssayMapper;
import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:12
 **/
@Service
public class EssayServiceImpl implements EssayService {

    @Autowired
    private EssayMapper essayMapper;

    @Override
    public Essay queryEssayById(Integer id) {
        return essayMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer updateEssayById(Essay essay) {
        return essayMapper.updateByPrimaryKeySelective(essay);
    }
}
