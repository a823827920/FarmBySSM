package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Plant;
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
 * @CreateTime 2019/4/10 20:24
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class PlantMapperTest {

    @Autowired
    private PlantMapper plantMapper;

    @Test
    public void testSelectPlantByPage(){
        Map<String,Object> map=new HashMap<>();
        map.put("index",1);
        map.put("limit",3);
        List<Plant> plants = plantMapper.selectByPage(map);
        System.out.println(plants);
    }

    @Test
    public void testCate(){
        Plant plant = plantMapper.selectByPrimaryKey(10000);
        System.out.println(plant);
    }
}
