package com.bushlay.demo.controller;

import com.bushlay.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
