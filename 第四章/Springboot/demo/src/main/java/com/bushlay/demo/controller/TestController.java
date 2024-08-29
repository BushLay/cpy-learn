package com.bushlay.demo.controller;

import com.bushlay.demo.entity.User;
import com.bushlay.demo.service.TestService;
import com.bushlay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test()
    {
        return testService.test();
    }
    @RequestMapping("/test2")
    public List<User> test2()
    {
        UserService userService = new UserService();
        return userService.getAll();
    }
}
