package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Field;
import com.ncuedu.farm.pojo.FieldExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FieldMapper {
    long countByExample(FieldExample example);

    int deleteByExample(FieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Field record);

    int insertSelective(Field record);

    List<Field> selectByExample(FieldExample example);

    Field selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Field record, @Param("example") FieldExample example);

    int updateByExample(@Param("record") Field record, @Param("example") FieldExample example);

    int updateByPrimaryKeySelective(Field record);

    int updateByPrimaryKey(Field record);
}