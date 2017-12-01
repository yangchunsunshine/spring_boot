package org.spring.springboot.service.impl;

import org.spring.springboot.dao.UserMapper;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
