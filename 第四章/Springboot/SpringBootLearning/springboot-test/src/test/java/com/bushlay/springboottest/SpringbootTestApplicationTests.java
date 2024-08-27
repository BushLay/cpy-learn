package com.bushlay.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringbootTestApplication.class)
class SpringbootTestApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private UserService userService;

    @Test
    public void testAdd(){
        userService.add();
    }


}
