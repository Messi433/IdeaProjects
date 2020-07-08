package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exception")
public class ExceptionController {
    @RequestMapping("exceptionSys")
    public String exceptionSys(){
        System.out.println("执行exceptionSys()");
        return "success";
    }
}
