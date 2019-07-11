package com.first.controller;

import com.first.entity.User;
import com.first.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public User index(){
        String userName = "zhangsan";
        User user = userService.getUserByUserName(userName);
        return user;
    }
}
