package com.ncuedu.farm.mapper;

import com.ncuedu.farm.vo.OrderCustom;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 14:47
 **/
public interface OrderCustomMapper {

    List<OrderCustom> queryOrderCustomsByPage(Map<String,Object> map);
}
