package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 项目启动类是一个配置类。并可以被组件扫描器扫描，
// 因为 @SpringBootApplication中的 @SpringBootConfiguration 上有 @Configuration。
@SpringBootApplication // 能够扫描 Spring 组件并自动配置 Spring Boot
public class Springboot01DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01DemoApplication.class, args);
    }

}
