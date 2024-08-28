package com.bushlay.springbootmybatis;

import com.bushlay.springbootmybatis.domain.User;
import com.bushlay.springbootmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testFindAll()
    {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Test
    void contextLoads() {
    }

}
