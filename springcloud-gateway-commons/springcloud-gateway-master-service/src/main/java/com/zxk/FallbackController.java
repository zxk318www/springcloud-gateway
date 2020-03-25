package com.zxk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-gateway-commons
 * @description: 网关熔断
 * @author: Zhangxike
 * @create: 2020-03-25 15:40
 **/
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return " I'm Spring Cloud Gateway fallback";
    }
}
