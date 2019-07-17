package com.first.controller;

import com.first.entity.User;
import com.first.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

//    @ResponseBody
//    @RequestMapping("/test")
//    public User index(){
//        String userName = "zhangsan";
//        User user = userService.getUserByUserName(userName);
//        return user;
//    }

    @RequestMapping("/inserts")
    public void insertsUser(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId("asd");
        user1.setUserName("tom");
        user1.setUserAge("23");
        users.add(user1);
        User user2 = new User();
        user2.setUserId("afg");
        user2.setUserName("tom");
        user2.setUserAge("23");
        users.add(user2);
        User user3 = new User();
        user3.setUserId("afc");
        user3.setUserName("tom");
        user3.setUserAge("23");
        users.add(user3);
//        userService.insertUsers(users);
        userService.save(user1);
    }
}
