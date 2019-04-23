package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.FieldMapper;
import com.ncuedu.farm.pojo.Field;
import com.ncuedu.farm.pojo.FieldExample;
import com.ncuedu.farm.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 19:55
 **/
@Service
public class FieldServiceImpl implements FieldService {

    @Autowired
    private FieldMapper fieldMapper;

    @Override
    public List<Field> queryFieldByLoc(String loc) {
        FieldExample fieldExample = new FieldExample();
        FieldExample.Criteria criteria = fieldExample.createCriteria();
        criteria.andLocLike(loc);
        List<Field> fields = fieldMapper.selectByExample(fieldExample);
        return fields;
    }

    @Override
    public Integer updateFieldById(Field field) {
        return fieldMapper.updateByPrimaryKeySelective(field);
    }
}
