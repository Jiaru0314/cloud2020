package com.xzq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaApplicatin7001
 * @description:
 * @author: XZQ
 * @create: 2020/3/5 23:19
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicatin7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin7001.class, args);
    }
}
