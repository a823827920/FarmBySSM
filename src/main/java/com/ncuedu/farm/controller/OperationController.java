package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.Operation;
import com.ncuedu.farm.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 20:18
 **/
@Controller
public class OperationController {

    @Autowired
    private OperationService operationService;

    @RequestMapping(value = "/admin/operations",method = RequestMethod.GET)
    public String showOperation(){
        return "admin/showOperation";
    }

    @RequestMapping(value = "/admin/operationsPage",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> showOperationByPage(Integer page,Integer limit){
        int count=operationService.queryOperationNum();
        List<Operation> operations = operationService.queryOperationsByPage(page, limit);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("data",operations);
        map.put("count",count);
        return map;
    }
}
