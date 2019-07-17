package com.first.dao;

import com.first.entity.User;

import java.util.List;

public interface UserMapper {
    User getUserByName(String userName);
    void insertUsers(List<User> users);
}
