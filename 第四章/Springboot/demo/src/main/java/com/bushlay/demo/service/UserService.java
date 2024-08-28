package com.bushlay.demo.service;

import com.bushlay.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    UserMapper userMapper;

    public void getAll()
    {
        userMapper.getAll();
    }
}
