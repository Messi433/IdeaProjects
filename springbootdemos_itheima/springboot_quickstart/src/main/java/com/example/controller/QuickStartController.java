package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("quick")
    @ResponseBody
    public String quickStart(){
//        return "SpringBoot访问成功";
        return "Hello SpringBoot2";
    }
}
