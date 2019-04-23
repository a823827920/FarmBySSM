package com.ncuedu.farm.mapper;

import com.ncuedu.farm.vo.OrderCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 15:03
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class OrderCustomMapperTest {

    @Autowired
    private OrderCustomMapper orderCustomMapper;

    @Test
    public void testSelectOrderCustomByPage(){
        Map<String,Object> map=new HashMap<>();
        map.put("index",0);
        map.put("limit",2);
        List<OrderCustom> orderCustoms = orderCustomMapper.queryOrderCustomsByPage(map);
        System.out.println(orderCustoms);
    }
}
