package com.zxk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-gateway-commons
 * @description:
 * @author: Zhangxike
 * @create: 2020-03-25 11:13
 **/
@RestController
public class BSayHelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "hello! I'm b.port "+port;
    }

    @RequestMapping("/name")
    public String name(String name){
        return "my name is "+name +".bbb";
    }

    @RequestMapping("/age")
    public String age(String age){
        return "I am"+ age + " years old. .bbb ";
    }

    @RequestMapping("/routeAll")
    public String routeAll(String pass){
        return "can i pass? "+ pass+" ! port:"+port;
    }
}
