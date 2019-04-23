package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.PlantCustomMapper;
import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.service.PlantCustomService;
import com.ncuedu.farm.vo.PlantCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 18:42
 **/
@Service
public class PlantCustomServiceImpl implements PlantCustomService {

    @Autowired
    private PlantCustomMapper plantCustomMapper;

    @Override
    public List<PlantCustom> queryPlantCustoms() {
        return plantCustomMapper.queryPlantCustoms();
    }

    @Override
    public List<Plant> queryPlantsByPage(Integer index, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        map.put("index",index);
        map.put("limit",limit);
        return plantCustomMapper.selectByPage(map);
    }
}
