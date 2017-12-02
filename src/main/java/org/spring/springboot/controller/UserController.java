package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id){
        int i=userService.deleteUser(id);
        if(i>0){
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping(value = "/findAll/{name}",method = RequestMethod.GET)
    public List<User> findAll(@PathVariable("name") String name){
        List<User> list=new ArrayList<User>();
        list=userService.getAllUsers(name);
       return list;
    }

    @RequestMapping(value="/updateUser",method = RequestMethod.POST)
    public Map<String,Object> updateUser(User user){
        Map<String,Object> map=new HashMap<String, Object>();
        try{
            user.setDate(new Date());
            userService.updateUser(user);
            map.put("200","success");
        }catch (Exception e){
            map.put("500","error");
        }
        return map;
    }


}
