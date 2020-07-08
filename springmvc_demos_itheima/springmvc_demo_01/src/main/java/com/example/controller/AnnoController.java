package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = "msg")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testParam(@RequestParam(name = "name") String username) {
        System.out.println("打印名称  " + username);
        return "success3";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("打印请求体  " + body);
        return "success3";
    }

    @RequestMapping(" /testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("打印sid参数  " + id);
        return " success";
    }

    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println(header);
        return "success";
    }

    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "success3";
    }
    @ModelAttribute
    public void showUser(String username, Map<String,User> userMap) {
        System.out.println("showUser执行了...");
        //通过用户查询数据库(模拟)
        User user = new User();
        user.setUsername("李四");
        user.setAge(20);
        user.setDate(new Date());
        userMap.put("abc",user);
    }
    //设置属性
    @RequestMapping("/testSetAttribute")
    public String testSetAttribute(Model model){
        model.addAttribute("msg","小妹儿");
        return "success4";
    }
    //获取属性
    @RequestMapping("/testGetAttribute")
    public String testGetAttribute(ModelMap modelMap){
        modelMap.get("msg");
        System.out.println(modelMap);
        return "success4";
    }
    //销毁session
    @RequestMapping("/testDelSession")
    public String testDelSession(SessionStatus status){
        status.setComplete();
        return "success4";
    }

}
