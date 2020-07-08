package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/param")
public class ParamController {
    @RequestMapping(path = "/testString")
    public String testParam(String username, String password) {
        System.out.println("打印用户名  " + username);
        System.out.println("打印密码  " + password);
        return "success3";
    }

    @RequestMapping(path = "/testBean")
    public String testParam(User user) {
        System.out.println("打印用户Bean  " + user);
        return "success3";
    }

    /**
     * 自定义类型转换器
     */
    @RequestMapping(path = "/testType")
    public String testTpye(User user) {
        System.out.println("打印用户Bean  " + user);
        return "success3";
    }

    /**
     * 获取Servlet原生API
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request地址  "+ request);
        System.out.println("response地址  "+response);

        HttpSession session = request.getSession();
        System.out.println("session地址  "+session);

        ServletContext servletContext = session.getServletContext();
        System.out.println("servletContext地址  "+servletContext);

        return "success3";
    }
}
