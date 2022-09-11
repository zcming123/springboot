package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication // 能够扫描 Spring 组件并自动配置 Spring Boot
public class Springboot01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01DemoApplication.class, args);
    }

}
