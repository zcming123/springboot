package com.lagou.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
// 开启 @ConfigurationProperties
@EnableConfigurationProperties(SimpleBean.class)
// 获取配置文件中，以 simplebean 为前缀的值。按照映射关系，把值注入到这个类的对应属性上。
// 即 把配置文件的内容转化为 Bean 对象。
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
