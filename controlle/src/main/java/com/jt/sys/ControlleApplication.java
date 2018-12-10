package com.jt.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
//@SpringCloudApplication
@EnableFeignClients
public class ControlleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlleApplication.class, args);
    }
}
