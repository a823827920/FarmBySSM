package com.ncuedu.farm.controller;

import com.google.gson.Gson;
import com.ncuedu.farm.pojo.Field;
import com.ncuedu.farm.pojo.Roomitem;
import com.ncuedu.farm.service.FieldService;
import com.ncuedu.farm.service.RoomitemCustomService;
import com.ncuedu.farm.service.RoomitemService;
import com.ncuedu.farm.vo.RoomitemCustom;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 15:35
 **/
@Controller
public class RoomitemController {

    @Autowired
    private RoomitemCustomService roomitemCustomService;

    @Autowired
    private RoomitemService roomitemService;

    @Autowired
    private FieldService fieldService;

    @RequestMapping(value = "/admin/roomitems",method = RequestMethod.GET)
    public String roomitems(){
        return "admin/showRequest";
    }

    @RequestMapping(value = "/admin/queryRoomitemsByPage",method = RequestMethod.GET)
    @ResponseBody
    public void queryRoomitems(Integer page, Integer limit, HttpServletResponse response){
        List<RoomitemCustom> roomitemCustoms = roomitemCustomService.queryRoomitemsByPage(page, limit);
        Integer count=roomitemService.queryRoomitemNum();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("count",count);
        map.put("data",roomitemCustoms);
        Gson gson = new Gson();
        String json = gson.toJson(map);
        writer.print(json);
    }

    @RequestMapping(value = "/admin/roomitem",method = RequestMethod.POST)
    @ResponseBody
    public Integer updateRoomitem(@RequestBody RoomitemCustom roomitemCustom){
        String loc=roomitemCustom.getItemLoc();
        List<Field> fields = fieldService.queryFieldByLoc("%"+loc+"%");
        if(fields.size()==0){
            return 0;
        }else{
            Field field = fields.get(0);
            field.setFlag((byte) 0);
            fieldService.updateFieldById(field);
            Roomitem roomitem = new Roomitem();
            roomitem.setFieldId(field.getId());
            roomitem.setItemStart(new Date());
            roomitem.setItemFlag((byte) 1);
            roomitem.setItemId(roomitemCustom.getItemId());
            roomitemService.updateRoomitemFlagById(roomitem);
        }
        return 1;
    }

    @RequestMapping(value = "/admin/roomitem",method = RequestMethod.GET)
    @ResponseBody
    public RoomitemCustom queryRoomitemByFieldId(Integer fieldId){
        List<RoomitemCustom> roomitemCustoms = roomitemCustomService.queryRoomitemByFieldId(fieldId);
        RoomitemCustom roomitemCustom = roomitemCustoms.get(0);
        return roomitemCustom;
    }
}
