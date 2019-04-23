package com.ncuedu.farm.mapper;

import com.ncuedu.farm.vo.RoomitemCustom;

import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 15:52
 **/
public interface RoomitemCustomMapper {

    List<RoomitemCustom> queryRoomitemsByPage(Map<String,Object> map);

    List<RoomitemCustom> queryRoomitemByFieldId(Integer id);
}
