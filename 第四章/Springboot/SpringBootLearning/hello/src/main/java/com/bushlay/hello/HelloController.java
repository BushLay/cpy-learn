package com.bushlay.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("住址:"+city+street);
        System.out.println("住址(数组):"+city2);
        System.out.println(msg);
        System.out.println(msg2);
        System.out.println("---------------------------");
        System.out.println("姓名:"+env.getProperty("name"));
        System.out.println("----------------------------");
        System.out.println(person);
        String[] address = person.getAddress();
        for (String s:address){
            System.out.println(s);
        }
        return "Hello SpringBoot!";
    }

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${address.city}")
    private String city;
    @Value("${address.street}")
    private String street;
//数组
    @Value("${address2[0]}")
    private String city2;
//纯量
    @Value("${msg1}")
    private String msg;
    @Value("${msg2}")
    private String msg2;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

}
