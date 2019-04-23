package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Cate;
import com.ncuedu.farm.pojo.CateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CateMapper {
    long countByExample(CateExample example);

    int deleteByExample(CateExample example);

    int deleteByPrimaryKey(Integer cateId);

    int insert(Cate record);

    int insertSelective(Cate record);

    List<Cate> selectByExample(CateExample example);

    Cate selectByPrimaryKey(Integer cateId);

    int updateByExampleSelective(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByExample(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByPrimaryKeySelective(Cate record);

    int updateByPrimaryKey(Cate record);
}