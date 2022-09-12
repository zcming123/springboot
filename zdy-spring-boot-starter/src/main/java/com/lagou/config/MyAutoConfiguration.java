package com.lagou.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
// @ConditionalOnClass(SimpleBean.class)
// 当类路径 classpath 下有指定的类时，才会进行自动配置。
// 如果没有 SimpleBean.class, 自动配置类 MyAutoConfiguration 进行自动配置的时候，会报错。
// @ConditionalOnClass
// 如果不设置.class，则 springboot 一定会完成 MyAutoConfiguration 的自动配置。
@ConditionalOnClass
public class MyAutoConfiguration {

    static {
        System.out.println("MyAutoConfiguration init....");
    }

    // 在自动配置的时候，会调用 simpleBean 这个方法。
    // 并将方法返回值对象存到 springboot 创建的 IOC 容器中。
    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}