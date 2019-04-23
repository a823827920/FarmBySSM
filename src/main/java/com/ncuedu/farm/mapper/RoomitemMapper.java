package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Roomitem;
import com.ncuedu.farm.pojo.RoomitemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoomitemMapper {
    long countByExample(RoomitemExample example);

    int deleteByExample(RoomitemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Roomitem record);

    int insertSelective(Roomitem record);

    List<Roomitem> selectByExample(RoomitemExample example);

    List<Roomitem> selectBypage(Map<String,Object> map);

    Roomitem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Roomitem record, @Param("example") RoomitemExample example);

    int updateByExample(@Param("record") Roomitem record, @Param("example") RoomitemExample example);

    int updateByPrimaryKeySelective(Roomitem record);

    int updateByPrimaryKey(Roomitem record);
}