package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello world!";
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(User user){
        return userService.addUser(user);
    }
}
