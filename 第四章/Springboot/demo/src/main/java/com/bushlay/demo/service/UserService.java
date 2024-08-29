package com.bushlay.demo.service;

import com.bushlay.demo.entity.User;
import com.bushlay.demo.mapper.UserMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class UserService {

    @Autowired
    private UserMapper userMapper;

    // 查询全部数据
    public List<User> getAll() {
        List<User> userList = userMapper.getAll();
        log.info("userList: " + userList);
        return userList;

    }

    // 插入数据
    public User addUser(User user) {
        int rowsAffected = userMapper.save(user);
        if (rowsAffected > 0) {
            return user; // 插入成功，返回插入的用户对象
        } else {
            return null; // 插入失败
        }
    }

    // 根据id查询数据
    public User getUserById(int id) {
        return userMapper.findById(id);
    }

    // 根据id删除数据
    public void deleteUser(int id) {
        userMapper.delete(id);
    }

    // 更新数据
    public boolean updateUser(User user) {
        int rowsAffected = userMapper.update(user);
        return rowsAffected > 0;
//        return userMapper.update(user);
    }
}
