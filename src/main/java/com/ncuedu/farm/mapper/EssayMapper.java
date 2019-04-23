package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.pojo.EssayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EssayMapper {
    long countByExample(EssayExample example);

    int deleteByExample(EssayExample example);

    int deleteByPrimaryKey(Integer essayId);

    int insert(Essay record);

    int insertSelective(Essay record);

    List<Essay> selectByExample(EssayExample example);

    Essay selectByPrimaryKey(Integer essayId);

    int updateByExampleSelective(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByExample(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKey(Essay record);
}