package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.Essay;
import com.ncuedu.farm.service.EssayCustomService;
import com.ncuedu.farm.service.EssayService;
import com.ncuedu.farm.vo.EssayCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/21 10:57
 **/
@Controller
public class EssayController {

    @Autowired
    private EssayCustomService essayCustomService;

    @Autowired
    private EssayService essayService;

    @RequestMapping(value = "/user/essay",method = RequestMethod.GET)
    public ModelAndView showEssays(Integer essayId){
        EssayCustom essayCustom= essayCustomService.queryEssayById(essayId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/essay");
        modelAndView.addObject("essay",essayCustom);
        return modelAndView;
    }

    @RequestMapping(value = "/user/essayPraise",method = RequestMethod.POST)
    @ResponseBody
    public Integer updateEssayPraise(Essay essay){
        Integer result = essayService.updateEssayById(essay);
        return result;
    }

    @RequestMapping(value = "/user/essays",method = RequestMethod.GET)
    public String showEssays(){
        return "user/essays";
    }

    @RequestMapping(value = "/user/queryEssays",method = RequestMethod.GET)
    @ResponseBody
    public List<EssayCustom> queryEssays(){
        return essayCustomService.queryEssays();
    }

    @RequestMapping(value = "/user/writeEssay",method = RequestMethod.GET)
    public String writeEssay(){
        return "user/writeEssay";
    }
}
