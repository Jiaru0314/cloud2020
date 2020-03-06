package com.xzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaApplicatin7002
 * @description:
 * @author: XZQ
 * @create: 2020/3/6 8:34
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicatin7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin7002.class, args);
    }
}
