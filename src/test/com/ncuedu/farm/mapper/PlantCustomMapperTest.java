package com.ncuedu.farm.mapper;

import com.ncuedu.farm.vo.PlantCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 18:04
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class PlantCustomMapperTest {

    @Autowired
    PlantCustomMapper plantCustomMapper;

    @Test
    public void testQueryPlantCustoms(){
        List<PlantCustom> plantCustoms = plantCustomMapper.queryPlantCustoms();
        System.out.println(plantCustoms);
    }
}
