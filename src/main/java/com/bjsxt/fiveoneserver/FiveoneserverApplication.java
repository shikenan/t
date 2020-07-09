package com.bjsxt.fiveoneserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FiveoneserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(FiveoneserverApplication.class, args);
    }

}
