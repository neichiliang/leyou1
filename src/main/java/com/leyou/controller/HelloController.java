package com.leyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: hello world
 * @author: zxb
 * @create: 2020-05-18 17:18
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }
}
