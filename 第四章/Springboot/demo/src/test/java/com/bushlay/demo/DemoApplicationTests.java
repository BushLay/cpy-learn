package com.bushlay.demo;

import com.bushlay.demo.entity.User;
import com.bushlay.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void getAll() {
        List<User> users = userMapper.getAll();
        System.out.println(users);
    }

}
