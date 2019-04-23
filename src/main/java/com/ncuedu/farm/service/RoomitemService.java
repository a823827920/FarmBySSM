package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.Roomitem;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 16:59
 **/
public interface RoomitemService {

    Integer queryRoomitemNum();

    Integer updateRoomitemFlagById(Roomitem roomitem);

    List<Roomitem> queryRoomitemByFieldId(Integer id);
}
