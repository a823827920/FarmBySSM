package com.ncuedu.farm.controller;

import com.google.gson.Gson;
import com.ncuedu.farm.pojo.Diary;
import com.ncuedu.farm.pojo.Roomitem;
import com.ncuedu.farm.service.DiaryService;
import com.ncuedu.farm.service.OperationService;
import com.ncuedu.farm.service.RoomitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/15 20:38
 **/
@Controller
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @Autowired
    private RoomitemService roomitemService;

    @Autowired
    private OperationService operationService;

    @RequestMapping(value = "/admin/diary",method = RequestMethod.GET)
    public String diaryForm(){
        return "admin/addDiary";
    }

    private Integer addDiaryFun(Diary diary){
        diary.setDiaryTime(new Date());
        List<Roomitem> roomitems = roomitemService.queryRoomitemByFieldId(diary.getFieldId());
        Roomitem roomitem = roomitems.get(0);
        Date itemStart = roomitem.getItemStart();
        int growDay= (int) ((new Date().getTime()-itemStart.getTime())/(1000*3600*24));
        diary.setPlantGrowday(growDay);
        Integer result = diaryService.insertDiary(diary);
        return result;
    }

    @RequestMapping(value = "/admin/diary",method = RequestMethod.POST)
    @ResponseBody
    public Integer addDiary(@RequestBody Diary diary){
        Integer result = addDiaryFun(diary);
        return result;
    }

    @RequestMapping(value = "/admin/newDiary",method = RequestMethod.GET)
    public String newDiaryForm(){
        return "admin/addNewDiary";
    }

    @RequestMapping(value = "/admin/newDiary",method = RequestMethod.POST)
    @ResponseBody
    public Integer addNewDiary( String map,Integer id){
        Gson gson=new Gson();
        Diary diary = gson.fromJson(map, Diary.class);
        addDiaryFun(diary);
        Integer result = operationService.deleteOperationById(id);
        return result;
    }
}
