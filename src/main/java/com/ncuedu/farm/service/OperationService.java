package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Operation;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 20:21
 **/
public interface OperationService{

    List<Operation> queryOperationsByPage(Integer page,Integer limit);

    Integer queryOperationNum();

    Integer deleteOperationById(Integer id);
}
