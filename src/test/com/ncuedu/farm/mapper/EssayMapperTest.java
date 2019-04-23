package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.pojo.User;
import com.ncuedu.farm.service.UserService;
import com.ncuedu.farm.vo.EssayCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 13:19
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class EssayMapperTest {

    @Autowired
    private EssayCustomMapper essayCustomMapper;

    @Test
    public void testSelectEssayById(){
        Essay essay = essayCustomMapper.selectEssayById(1);
        System.out.println(essay);
    }

    @Test
    public void testSelectEssays(){
        List<EssayCustom> essayCustoms = essayCustomMapper.selectEssays();
        System.out.println(essayCustoms);
    }


}
