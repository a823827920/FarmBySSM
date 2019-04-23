package com.ncuedu.farm.service.impl;

import com.ncuedu.farm.mapper.UserMapper;
import com.ncuedu.farm.pojo.User;
import com.ncuedu.farm.pojo.UserExample;
import com.ncuedu.farm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Desc
 * @Author zhang
 * @CreateTime 2019/4/10 16:18
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<User> queryUsers() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> queryUsersByName(String name) {
        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameLike(name);
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public List<User> queryUserNumByTel(String tel) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserTelLike(tel);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public List<User> queryUserNumByEmail(String email) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserEmailEqualTo(email);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public List<User> queryUserByPage(Integer page, Integer limit) {
        Integer index=(page-1)*limit;
        Map<String,Object> map=new HashMap<>();
        map.put("index",index);
        map.put("limit",limit);
        List<User> users = userMapper.selectUserByPage(map);
        return users;
    }

    @Override
    public Integer queryUserNum() {
        return userMapper.selectByExample(null).size();
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User queryUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }


}
