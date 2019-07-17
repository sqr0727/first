package com.first.service.impl;

import com.first.dao.UserDao;
import com.first.dao.UserMapper;
import com.first.entity.User;
import com.first.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }

//    @Autowired
//    private UserMapper userMapper;
//    @Override
//    public User getUserByUserName(String userName) {
//        return userMapper.getUserByName(userName);
//    }
//
//    @Override
//    public void insertUsers(List<User> users) {
//        userMapper.insertUsers(users);
//    }
}
