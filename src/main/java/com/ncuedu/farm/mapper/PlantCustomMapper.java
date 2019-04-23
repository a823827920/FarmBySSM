package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.vo.PlantCustom;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 17:57
 **/
public interface PlantCustomMapper {

    List<PlantCustom> queryPlantCustoms();

    List<Plant> selectByPage(Map<String,Object> map);
}
