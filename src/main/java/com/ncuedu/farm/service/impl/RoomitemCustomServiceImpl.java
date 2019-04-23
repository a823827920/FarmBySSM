package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.RoomitemCustomMapper;
import com.ncuedu.farm.service.RoomitemCustomService;
import com.ncuedu.farm.vo.RoomitemCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 16:30
 **/
@Service
public class RoomitemCustomServiceImpl implements RoomitemCustomService {

    @Autowired
    private RoomitemCustomMapper roomitemCustomMapper;

    @Override
    public List<RoomitemCustom> queryRoomitemsByPage(Integer page, Integer limit) {
        Map<String,Object> map=new HashMap<>();
        Integer index=(page-1)*limit;
        map.put("index",index);
        map.put("limit",limit);
        List<RoomitemCustom> roomitemCustoms = roomitemCustomMapper.queryRoomitemsByPage(map);
        return roomitemCustoms;
    }

    @Override
    public List<RoomitemCustom> queryRoomitemByFieldId(Integer id) {
        return roomitemCustomMapper.queryRoomitemByFieldId(id);
    }
}
