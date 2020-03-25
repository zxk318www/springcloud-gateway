package com.zxk.Controller;

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
public class ASayHelloController {

    /**
     * 读配置文件中的端口
     */
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "hello! I'm a.port"+port;
    }

    /**
     * 接收从网关传入的参数
     * @param name
     * @return
     */
    @RequestMapping("/name")
    public String name(String name){
        return "my name is "+name +".aaa";
    }

    /**
     * 接收从网关传入的参数
     * @param age
     * @return
     */
    @RequestMapping("/age")
    public String age(String age){
        return "I am"+ age + "years";
    }

    @RequestMapping("/routeAll")
    public String routeAll(String pass){
        return "can i pass? "+ pass+" ! port:"+port;
    }
}
