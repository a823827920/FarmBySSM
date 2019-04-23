package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Crop;
import com.ncuedu.farm.pojo.CropExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CropMapper {
    long countByExample(CropExample example);

    int deleteByExample(CropExample example);

    int deleteByPrimaryKey(Integer cropId);

    int insert(Crop record);

    int insertSelective(Crop record);

    List<Crop> selectByExample(CropExample example);

    Crop selectByPrimaryKey(Integer cropId);

    int updateByExampleSelective(@Param("record") Crop record, @Param("example") CropExample example);

    int updateByExample(@Param("record") Crop record, @Param("example") CropExample example);

    int updateByPrimaryKeySelective(Crop record);

    int updateByPrimaryKey(Crop record);
}