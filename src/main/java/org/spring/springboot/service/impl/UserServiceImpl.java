package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserMapper;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(Integer id) {

        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUsers(String name) {
        List<User> list=new ArrayList<User>();
        list=userMapper.selectAllUsers(name);
        return list;
    }


    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
