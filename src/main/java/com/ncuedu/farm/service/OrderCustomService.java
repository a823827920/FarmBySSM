package com.ncuedu.farm.service;

import com.ncuedu.farm.vo.OrderCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 15:09
 **/
public interface OrderCustomService {

    List<OrderCustom> queryOrderCustomByPage(Integer page,Integer limit);
}
