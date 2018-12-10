package com.jt.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer//注册中心
@SpringBootApplication
public class EurekeApplication  {

    public static void main(String[] args) {
        SpringApplication.run(EurekeApplication.class, args);
    }



}
