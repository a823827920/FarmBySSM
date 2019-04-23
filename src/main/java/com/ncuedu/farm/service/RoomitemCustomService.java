package com.ncuedu.farm.service;

import com.ncuedu.farm.vo.RoomitemCustom;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 16:30
 **/
public interface RoomitemCustomService {

    List<RoomitemCustom> queryRoomitemsByPage(Integer page,Integer limit);

    List<RoomitemCustom> queryRoomitemByFieldId(Integer id);
}
