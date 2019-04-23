package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.Crop;
import com.ncuedu.farm.service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/17 13:56
 **/
@Controller
public class CropController {

    @Autowired
    private CropService cropService;

    @RequestMapping(value = "/admin/crop",method = RequestMethod.GET)
    public String addCropForm(){
        return "admin/addCrop";
    }

    @RequestMapping(value = "/admin/crop",method = RequestMethod.POST)
    @ResponseBody
    public Integer addCrop(@RequestBody Crop crop){
        return cropService.insertCrop(crop);
    }
}
