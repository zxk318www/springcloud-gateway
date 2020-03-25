package com.zxk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud-gateway-commons
 * @description:
 * @author: Zhangxike
 * @create: 2020-03-25 10:49
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegistryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceApplication.class,args);
    }
}
