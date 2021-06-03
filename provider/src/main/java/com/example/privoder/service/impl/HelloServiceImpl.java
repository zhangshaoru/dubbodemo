package com.example.privoder.service.impl;

import com.example.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author zhangshaoru
 * @date 2021/5/8 4:10 下午
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String msg) {
        return "hello dubbo";
    }
}
