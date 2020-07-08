package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器-测试
 */
@Controller
@RequestMapping("/helloworld") //注解到类，一级目录
public class HelloWorldController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello World"); //注解到方法，二级目录
        return "success";
    }

}
