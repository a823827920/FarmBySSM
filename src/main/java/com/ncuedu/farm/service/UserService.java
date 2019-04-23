package com.ncuedu.farm.service;

import com.ncuedu.farm.pojo.User;

import java.util.List;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 16:15
 **/
public interface UserService {

    List<User> queryUsers();

    List<User> queryUsersByName(String name);

    Integer insertUser(User user);

    List<User> queryUserNumByTel(String tel);

    List<User> queryUserNumByEmail(String email);

    List<User> queryUserByPage(Integer page,Integer limit);

    Integer queryUserNum();

    Integer updateUser(User user);

    User queryUserById(Integer id);


}
