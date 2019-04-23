package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.OrderMapper;
import com.ncuedu.farm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 15:16
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Integer queryOrderNum() {
        return orderMapper.selectByExample(null).size();
    }

    @Override
    public Integer deleteOrderById(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }
}
