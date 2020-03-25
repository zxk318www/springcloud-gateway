package com.zxk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud-gateway-commons
 * @description:
 * @author: Zhangxike
 * @create: 2020-03-25 14:50
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayMaster {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMaster.class,args);
    }
}
