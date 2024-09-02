package com.bushlay.demo;

import com.bushlay.demo.entity.User;
import com.bushlay.demo.mapper.TableMapper;
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

//    @Test
//    void createTable() {
//        userMapper.createTable();
//    }
    //注入TableMapper
    @Autowired
    private TableMapper tableMapper;
    //测试类
    @Test
        void createTable() {
        String tableName = "my_table_name3";
        tableMapper.createTable(tableName);
    }


}
