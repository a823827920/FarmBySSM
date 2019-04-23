package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Operation;
import com.ncuedu.farm.pojo.OperationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OperationMapper {
    long countByExample(OperationExample example);

    int deleteByExample(OperationExample example);

    int deleteByPrimaryKey(Integer operationId);

    int insert(Operation record);

    int insertSelective(Operation record);

    List<Operation> selectByExample(OperationExample example);

    List<Operation> selectByPage(Map<String,Object> map);

    Operation selectByPrimaryKey(Integer operationId);

    int updateByExampleSelective(@Param("record") Operation record, @Param("example") OperationExample example);

    int updateByExample(@Param("record") Operation record, @Param("example") OperationExample example);

    int updateByPrimaryKeySelective(Operation record);

    int updateByPrimaryKey(Operation record);
}