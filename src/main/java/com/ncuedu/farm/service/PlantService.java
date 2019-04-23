package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Plant;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 19:51
 **/
public interface PlantService {

    List<Plant> queryPlants();

    List<Plant> queryPlantsByPage(Integer index,Integer limit);

    Integer queryPlantNum();

    Integer updatePlant(Plant plant);

    Integer insertPlant(Plant plant);

    List<Plant> queryPlantByCateIdAndOrderBySalepriceDiscount(Integer cateId);

    List<Plant> queryAllOnlinePlants();

    List<Plant> queryOnlinePlantsByCate(Integer cateId);

    List<Plant> queryOnlinePlantsByName(String name);

}
