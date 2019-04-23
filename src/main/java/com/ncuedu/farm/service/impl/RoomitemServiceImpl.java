package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.RoomitemMapper;
import com.ncuedu.farm.pojo.Roomitem;
import com.ncuedu.farm.pojo.RoomitemExample;
import com.ncuedu.farm.service.RoomitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 17:00
 **/
@Service
public class RoomitemServiceImpl implements RoomitemService {

    @Autowired
    private RoomitemMapper roomitemMapper;

    @Override
    public Integer queryRoomitemNum() {
        List<Roomitem> roomitems = roomitemMapper.selectByExample(null);
        return roomitems.size();
    }

    @Override
    public Integer updateRoomitemFlagById(Roomitem roomitem) {
        int result = roomitemMapper.updateByPrimaryKeySelective(roomitem);
        return result;
    }

    @Override
    public List<Roomitem> queryRoomitemByFieldId(Integer id) {
        RoomitemExample roomitemExample = new RoomitemExample();
        RoomitemExample.Criteria criteria = roomitemExample.createCriteria();
        criteria.andFieldIdEqualTo(id);
        List<Roomitem> roomitems = roomitemMapper.selectByExample(roomitemExample);
        return roomitems;
    }
}
