package com.ncuedu.farm.mapper;

import com.ncuedu.farm.pojo.User;
import com.ncuedu.farm.service.UserService;
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
public class UserMapperTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService(){
        List<User> users = userService.queryUsers();
        System.out.println(users);
    }

    @Test
    public void testUserService2(){
        List<User> users = userService.queryUsersByName("%测试%");
        System.out.println(users);
    }

}
