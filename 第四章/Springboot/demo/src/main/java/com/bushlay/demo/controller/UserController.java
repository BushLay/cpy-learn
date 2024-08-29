package com.bushlay.demo.controller;

import com.bushlay.demo.entity.User;
import com.bushlay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//设置api端点
@RestController
@RequestMapping("/api/users")//设定api路径,与前端axios获取的路径一致
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        // 假设你有一个方法保存用户数据
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        // 假设你有一个方法根据ID获取用户数据
        return userService.getUserById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        // 假设你有一个方法根据ID删除用户数据
        userService.deleteUser(id);
    }
//    更新数据
    @PutMapping("/{id}")
    public boolean updateUser(@PathVariable int id, @RequestBody User user) {
        // 假设你有一个方法根据ID更新用户数据
        return userService.updateUser(user);
    }
}

