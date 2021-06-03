package com.example.consumer.controller;

import com.example.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshaoru
 * @date 2021/5/8 4:55 下午
 */
@RequestMapping("hello")
@RestController
public class HelloController {
    @Reference(version = "1.0.0",check = false)
    HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return helloService.hello("test");
    }
}
