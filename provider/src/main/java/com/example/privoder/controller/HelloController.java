package com.example.privoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangshaoru
 * @date 2021/5/8 3:49 下午
 */

@RequestMapping("hello")
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello dubbo";
    }
}
