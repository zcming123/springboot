package com.lagou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //标明该类为配置类
public class MyConfig {
    //将返回值对象作为 Bean 组件添加到 spring容器中，该 Bean id 默认是方法名
    @Bean(name = "iservice")
    public MyService myService() {

        return new MyService();
    }


}
