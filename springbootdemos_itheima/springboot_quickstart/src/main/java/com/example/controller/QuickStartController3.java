package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通过@ConfigurationProperties取得 applicaiton.yml的对象数据
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class QuickStartController3 {
    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("quick3")
    @ResponseBody
    public String quickStart() {
        return "name：   " + name + "   addr ：  " + addr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
