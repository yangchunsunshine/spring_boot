package org.spring.springboot.service;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(Integer id);
    List<User> getAllUsers(String name);
    void updateUser(User user);
}
