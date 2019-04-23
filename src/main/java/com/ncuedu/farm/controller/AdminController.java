package com.ncuedu.farm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 19:20
 **/
@Controller
public class AdminController {

    @RequestMapping("/admin/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }


}
