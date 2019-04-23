package com.ncuedu.farm.controller;

import com.ncuedu.farm.pojo.User;
import com.ncuedu.farm.service.UserService;
import com.ncuedu.farm.util.GetMessageCode;
import com.ncuedu.farm.vo.EssayCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 17:14
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "user/index";
    }

    @RequestMapping(value = "/user/register",method = RequestMethod.GET)
    public String registerForm(){
        return "user/register";
    }

    @RequestMapping(value = "/user/register_tel",method = RequestMethod.GET)
    public String registerTelForm(){
        return "user/register_tel";
    }

    @RequestMapping(value = "/user/register_email",method = RequestMethod.GET)
    public String registerEmailForm(){
        return "user/register_email";
    }

    @RequestMapping(value = "/user/isSame",method = RequestMethod.GET)
    @ResponseBody
    public Integer isSameTel(String tel){
        Integer result = userService.queryUserNumByTel(tel).size();
        return result;
    }

    @RequestMapping(value = "/user/isSameEmail",method = RequestMethod.GET)
    @ResponseBody
    public Integer isSameEmail(String email){
        Integer result = userService.queryUserNumByEmail(email).size();
        return result;
    }

    @RequestMapping(value = "/user/sendMessage",method = RequestMethod.GET)
    @ResponseBody
    public String sendMessage(String tel, HttpSession session){
        String code = GetMessageCode.getCode(tel);
        session.setAttribute("code",code);
        return code;
    }

    @RequestMapping(value = "/user/submit",method = RequestMethod.GET)
    @ResponseBody
    public Integer submit(String code,HttpSession session){
        String realCode= (String) session.getAttribute("code");
        if(realCode==null||!realCode.equals(code)){
            return 0;
        }
        return 1;
    }

    @RequestMapping(value = "/user/login",method = RequestMethod.GET)
    public String loginForm(){
        return "user/login";
    }

    @RequestMapping(value = "/user/login_email",method = RequestMethod.GET)
    public String loginEmailForm(){
        return "user/login_email";
    }

    @RequestMapping(value = "/user/submit",method = RequestMethod.POST)
    @ResponseBody
    public Integer submitCheck(@RequestBody User user,HttpSession session){
        Integer result = userService.insertUser(user);
        session.setAttribute("user",user);
        return result;
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String users(){
        return "admin/showUser";
    }

    @RequestMapping(value = "/user/usersPage",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> showUserByPage(Integer page, Integer limit){
        List<User> users = userService.queryUserByPage(page, limit);
        int count=userService.queryUserNum();
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("data",users);
        map.put("count",count);
        return map;
    }

    @RequestMapping(value = "/user/loginTel",method = RequestMethod.POST)
    @ResponseBody
    public Integer loginTel(@RequestBody User user,HttpSession session){
        List<User> users = userService.queryUserNumByTel(user.getUserTel());
        User user1 = users.get(0);
        session.setAttribute("user",user1);
        return users.size();
    }

    @RequestMapping(value = "/user/loginEmail",method = RequestMethod.POST)
    @ResponseBody
    public Integer loginEmail(@RequestBody User user,HttpSession session){
        List<User> users = userService.queryUserNumByEmail(user.getUserEmail());
        User user1 = users.get(0);
        if(user1.getUserPassword().equals(user.getUserPassword())){
            session.setAttribute("user",user1);
            return 1;
        }
        return 0;
    }

    @RequestMapping(value = "/user/logOut",method = RequestMethod.GET)
    public String logOut(HttpSession session){
        session.removeAttribute("user");
        return "user/index";
    }

    @RequestMapping(value = "/user/person",method = RequestMethod.GET)
    public String personSet(){
        return "user/person";
    }

    @RequestMapping(value = "/user/",method = RequestMethod.POST)
    @ResponseBody
    public Integer updateUser(@RequestBody User user,HttpSession session){
        Integer result = userService.updateUser(user);
        User user1 = userService.queryUserById(user.getUserId());
        session.setAttribute("user",user1);
        return result;
    }

    @RequestMapping(value = "/user/store",method = RequestMethod.GET)
    public String storePage(){
        return "user/store";
    }


}
