package com.zxk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud-gateway-commons
 * @description:
 * @author: Zhangxike
 * @create: 2020-03-25 11:17
 **/
@SpringBootApplication
@EnableEurekaClient
public class AServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AServiceApplication.class,args);
    }
}
