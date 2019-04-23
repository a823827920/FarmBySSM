package com.ncuedu.farm.controller;

import com.ncuedu.farm.service.OrderCustomService;
import com.ncuedu.farm.service.OrderService;
import com.ncuedu.farm.vo.OrderCustom;
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
 * @CreateTime 2019/4/17 14:44
 **/
@Controller
public class OrderController {

    @Autowired
    private OrderCustomService orderCustomService;

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/admin/deliverys",method = RequestMethod.GET)
    public String showDeliveryPage(){
        return "admin/showDelivery";
    }

    @RequestMapping(value = "/admin/deliveryPage",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> showOrderCustomPage(Integer page, Integer limit){
        List<OrderCustom> orderCustoms = orderCustomService.queryOrderCustomByPage(page, limit);
        Map<String,Object> map=new HashMap<>();
        Integer count=orderService.queryOrderNum();
        map.put("code",0);
        map.put("data",orderCustoms);
        map.put("count",count);
        return map;
    }

    @RequestMapping(value = "/admin/delivery",method = RequestMethod.PUT)
    @ResponseBody
    public Integer handleDelivery(Integer id){
        return orderService.deleteOrderById(id);
    }
}
