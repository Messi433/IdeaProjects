package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 控制器-测试
 */
@Controller
@RequestMapping("/user") //注解到类，一级目录
public class UserController {
    @RequestMapping(path = "/testReturnString")
    public String testReturnString(){
        System.out.println("返回字符串");
        return "success";
    }
    @RequestMapping(path = "/testReturnVoid")
    public void testReturnVoid(){
        System.out.println("返回void");
    }

    /**
     * 添加ServletAPI，手动实现相应路径跳转
     * @param request
     * @param response
     */
    @RequestMapping(path = "/testReturnVoid2")
    public void testReturnVoid2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("返回void2");
        request.getRequestDispatcher("WEB-INF/pages/success.jsp").forward(request,response);

    }
    //重定向
    @RequestMapping(path = "/testReturnVoid3")
    public void testReturnVoid3(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("返回void3");
        response.sendRedirect(request.getContextPath()+"index.jsp");
    }
    //直接响应
    @RequestMapping(path = "/testReturnVoid4")
    public void testReturnVoid4(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("返回void4");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("Hello World");

    }
    /**
     *  返回ModelAndView对象(重要)
     */
    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testModelAndView执行");
        User user = new User();
        user.setUsername("messi");
        user.setAge(18);
        ModelAndView mv = new ModelAndView();
        //user对象存到mv对象中，同时由于其底层机制，也存到request中
        mv.addObject("user",user);
        //设置跳转页面
        mv.setViewName("success");
        return mv;
    }
    /**
     *  使用关键字实现页面跳转
     */
    @RequestMapping("testForwardOrResponse1")
    public String testForwardOrResponse1(){
        return "forward:/WEB-INF/pages/success.jsp";
    }

    @RequestMapping("testForwardOrResponse2")
    public String testForwardOrResponse2(){
        return "redirect:/index.jsp";
    }

    /**
     * Ajax异步操作1
     * @param body
     */
    @RequestMapping("testAjax")
    public void testAjax(@RequestBody String body){
        System.out.println("执行testAjax()");
        System.out.println(body);
    }
    /**
     * 1.前端发送json数据-→后端方法通过User参数进行Bean的封装->打印user
     * 2.后端方法从数据库取得User对象返回给前端ajax->前端输出
     * @param user
     * @return
     */
    @RequestMapping("testAjax2")
    public @ResponseBody User testAjax2(@RequestBody User user){
        System.out.println("执行testAjax2()");
        System.out.println(user);
        //模拟从数据库取user对象
        user.setAge(40);
        user.setUsername("丽丽");
        return user;
    }
}
