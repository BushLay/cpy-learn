package com.bushlay.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class TestService {
    public String test() {
        log.info("test");
        return "sucess";
    }
}
