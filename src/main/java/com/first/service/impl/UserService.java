package com.first.service.impl;

import com.first.dao.UserMapper;
import com.first.entity.User;
import com.first.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByName(userName);
    }
}
