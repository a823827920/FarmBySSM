package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.vo.PlantCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 18:42
 **/
public interface PlantCustomService {

    List<PlantCustom> queryPlantCustoms();

    List<Plant> queryPlantsByPage(Integer index, Integer limit);
}
