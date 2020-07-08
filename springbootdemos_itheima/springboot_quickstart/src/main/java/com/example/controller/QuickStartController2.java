package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通过@Value取得 applicaiton.yml的数据
 */
@Controller
public class QuickStartController2 {
    @Value("${name}")
    private String name;
    @Value("${person.addr}")
    private String addr;

    @RequestMapping("quick2")
    @ResponseBody
    public String quickStart() {
        return "name：   " + name + "   addr ：  " + addr;
    }
}
