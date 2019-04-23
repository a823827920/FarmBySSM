package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.pojo.PlantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PlantMapper {
    long countByExample(PlantExample example);

    int deleteByExample(PlantExample example);

    int deleteByPrimaryKey(Integer plantId);

    int insert(Plant record);

    int insertSelective(Plant record);

    List<Plant> selectByExample(PlantExample example);

    List<Plant> selectByPage(Map<String, Object> map);

    List<Plant> selectBySalepriceDiscountAndCateId(Integer cateId);

    Plant selectByPrimaryKey(Integer plantId);

    int updateByExampleSelective(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExample(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByPrimaryKeySelective(Plant record);

    int updateByPrimaryKey(Plant record);

}