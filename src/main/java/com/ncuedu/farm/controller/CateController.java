package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.Cate;
import com.ncuedu.farm.service.CateService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/12 15:46
 **/
@Controller
public class CateController {

    @Autowired
    private CateService cateService;

    @RequestMapping(value = "/admin/cate/",method = RequestMethod.GET)
    public String insetCateForm(){
        return "admin/addCate";
    }

    @RequestMapping(value = "/admin/cate/",method = RequestMethod.POST)
    @ResponseBody
    public Integer insertCate(@RequestBody Cate cate){
        return cateService.insertCate(cate);
    }

    @RequestMapping(value = "/admin/cates/",method = RequestMethod.GET)
    @ResponseBody
    public List<Cate> queryCates(){
        return cateService.querySecondCates();
    }

    @RequestMapping(value = "/user/cates",method = RequestMethod.GET)
    @ResponseBody
    public List<Cate> queryCatesForUser(){
        return cateService.querySecondCates();
    }

}
