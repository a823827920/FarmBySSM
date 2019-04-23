package com.ncuedu.farm.mapper;

import com.ncuedu.farm.service.RoomitemCustomService;
import com.ncuedu.farm.vo.RoomitemCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 16:27
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/applicationContextService.xml", "file:src/main/webapp/WEB-INF/applicationContextDao.xml"})
public class RomitemCustomMapperTest {

    @Autowired
    private RoomitemCustomService roomitemCustomService;

    @Test
    public void testQueryRoomitemByPage(){
        List<RoomitemCustom> roomitemCustoms = roomitemCustomService.queryRoomitemsByPage(1, 3);
        System.out.println(roomitemCustoms);
    }

    @Test
    public void testSelectRoomitemById(){
        List<RoomitemCustom> roomitemCustoms = roomitemCustomService.queryRoomitemByFieldId(4);
        System.out.println(roomitemCustoms);
    }
}
