package com.bushlay.demo.controller;

import com.bushlay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    UserService userService;

    @GetMapping("/getAll")
    public void getAll() {
        userService.getAll();
    }
//    @GetMapping("/getAll")

}
