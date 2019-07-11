package com.first.dao;

import com.first.entity.User;

public interface UserMapper {
    User getUserByName(String userName);
}
