package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.OrderCustomMapper;
import com.ncuedu.farm.service.OrderCustomService;
import com.ncuedu.farm.vo.OrderCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 15:10
 **/
@Service
public class OrderCustomServiceImpl implements OrderCustomService {

    @Autowired
    private OrderCustomMapper orderCustomMapper;

    @Override
    public List<OrderCustom> queryOrderCustomByPage(Integer page, Integer limit) {
        Integer index=(page-1)*limit;
        Map<String,Object> map=new HashMap<>();
        map.put("index",index);
        map.put("limit",limit);
        return orderCustomMapper.queryOrderCustomsByPage(map);
    }
}
