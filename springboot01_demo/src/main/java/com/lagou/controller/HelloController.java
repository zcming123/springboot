package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //相当于配置 @Responsebody+@Controller
public class HelloController {
    @RequestMapping("/demo")
    public String demo() {
        return "hello，springboot";
    }
}
