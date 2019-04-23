package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.PlantMapper;
import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.pojo.PlantExample;
import com.ncuedu.farm.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 19:52
 **/
@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    private PlantMapper plantMapper;

    @Override
    public List<Plant> queryPlants() {
        return plantMapper.selectByExample(null);
    }

    @Override
    public List<Plant> queryPlantsByPage(Integer index, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        map.put("index",index);
        map.put("limit",limit);
        return plantMapper.selectByPage(map);
    }

    @Override
    public Integer queryPlantNum() {
        return plantMapper.selectByExample(null).size();
    }

    @Override
    public Integer updatePlant(Plant plant) {
        return plantMapper.updateByPrimaryKeySelective(plant);
    }

    @Override
    public Integer insertPlant(Plant plant) {
        return plantMapper.insertSelective(plant);
    }

    @Override
    public List<Plant> queryPlantByCateIdAndOrderBySalepriceDiscount(Integer cateId) {
        return plantMapper.selectBySalepriceDiscountAndCateId(cateId);
    }

    @Override
    public List<Plant> queryAllOnlinePlants() {
        PlantExample plantExample = new PlantExample();
        PlantExample.Criteria criteria = plantExample.createCriteria();
        criteria.andPlantFlagEqualTo(1);
        return plantMapper.selectByExample(plantExample);
    }

    @Override
    public List<Plant> queryOnlinePlantsByCate(Integer cateId) {
        PlantExample plantExample = new PlantExample();
        PlantExample.Criteria criteria = plantExample.createCriteria();
        criteria.andPlantFlagEqualTo(1);
        criteria.andCateIdEqualTo(cateId);
        return plantMapper.selectByExample(plantExample);
    }

    @Override
    public List<Plant> queryOnlinePlantsByName(String name) {
        PlantExample plantExample = new PlantExample();
        PlantExample.Criteria criteria = plantExample.createCriteria();
        criteria.andPlantFlagEqualTo(1);
        criteria.andPlantNameLike("%"+name+"%");
        return plantMapper.selectByExample(plantExample);
    }


}
