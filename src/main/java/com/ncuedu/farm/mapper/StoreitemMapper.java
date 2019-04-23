package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Storeitem;
import com.ncuedu.farm.pojo.StoreitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreitemMapper {
    long countByExample(StoreitemExample example);

    int deleteByExample(StoreitemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Storeitem record);

    int insertSelective(Storeitem record);

    List<Storeitem> selectByExample(StoreitemExample example);

    Storeitem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Storeitem record, @Param("example") StoreitemExample example);

    int updateByExample(@Param("record") Storeitem record, @Param("example") StoreitemExample example);

    int updateByPrimaryKeySelective(Storeitem record);

    int updateByPrimaryKey(Storeitem record);
}