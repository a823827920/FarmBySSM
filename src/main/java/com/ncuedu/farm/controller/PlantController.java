package com.ncuedu.farm.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ncuedu.farm.pojo.Cate;
import com.ncuedu.farm.pojo.Plant;
import com.ncuedu.farm.service.PlantCustomService;
import com.ncuedu.farm.service.PlantService;
import com.ncuedu.farm.service.UserService;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 19:43
 **/
@Controller
public class PlantController {

    @Autowired
    private PlantService plantService;

    @Autowired
    private PlantCustomService plantCustomService;

    @RequestMapping(value = "/admin/plants",method = RequestMethod.GET)
    public String showPlantsForAdmin(){
        return "admin/showPlant";
    }

    @RequestMapping(value = "/admin/plantsPage",method = RequestMethod.GET)
    @ResponseBody
    public void getPlantsByPage(Integer limit, Integer page, HttpServletResponse response){
        Integer index=limit*(page-1);
        List<Plant> plants = plantCustomService.queryPlantsByPage(index, limit);
        int count=plantService.queryPlantNum();
        Map<String,Object> map=new HashMap<>();
        Gson gson=new Gson();
        map.put("code",0);
        map.put("data",plants);
        map.put("count",count);
        String json = gson.toJson(map);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print(json);
    }

    @RequestMapping(value = "/admin/plant/",method = RequestMethod.PUT)
    @ResponseBody
    public int upDownShelf( Plant plant ){
        Integer result = plantService.updatePlant(plant);
        return result;
    }

    @RequestMapping(value = "/admin/plant",method = RequestMethod.PUT)
    @ResponseBody
    public int updatePlant( String map ){
        JSONObject object=JSONObject.fromObject(map);
        Plant plant=(Plant)JSONObject.toBean(object,Plant.class);
        Integer result = plantService.updatePlant(plant);
        return result;
    }

    @RequestMapping(value = "/admin/plant/",method = RequestMethod.GET)
    public String editPlant(){
        return "admin/editPlant";
    }

    @RequestMapping(value = "/admin/plant",method = RequestMethod.GET)
    public String addPlantForm(){
        return "admin/addPlant";
    }

    @RequestMapping(value = "/admin/plant/",method = RequestMethod.POST)
    @ResponseBody
    public Integer addPlant(@RequestBody Plant plant){
        return plantService.insertPlant(plant);
    }

    @RequestMapping(value = "/user/plants/",method = RequestMethod.GET)
    @ResponseBody
    public List<Plant> queryOnlinePlants(){
        return plantService.queryAllOnlinePlants();
    }

    @RequestMapping(value = "/user/plantsCate",method = RequestMethod.GET)
    @ResponseBody
    public List<Plant> queryOnlinePlantsByCateId(Integer cateId){
        return plantService.queryOnlinePlantsByCate(cateId);
    }

    @RequestMapping(value = "/user/search",method = RequestMethod.GET)
    public String searchPlantsForm(String plantName, HttpServletRequest request){
        request.setAttribute("plantName",plantName);
        return "user/store";
    }

    @RequestMapping(value = "/user/search",method = RequestMethod.POST)
    @ResponseBody
    public List<Plant> searchPlants(String plantName){
        List<Plant> plants = plantService.queryOnlinePlantsByName(plantName);
        return plants;
    }
}
