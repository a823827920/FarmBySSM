package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.OperationMapper;
import com.ncuedu.farm.pojo.Operation;
import com.ncuedu.farm.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 20:22
 **/
@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationMapper operationMapper;


    @Override
    public List<Operation> queryOperationsByPage(Integer page, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        int index=(page-1)*limit;
        map.put("index",index);
        map.put("limit",limit);
        List<Operation> operations = operationMapper.selectByPage(map);
        return operations;
    }

    @Override
    public Integer queryOperationNum() {
        List<Operation> operations = operationMapper.selectByExample(null);
        return operations.size();
    }

    @Override
    public Integer deleteOperationById(Integer id) {
        return operationMapper.deleteByPrimaryKey(id);
    }
}
