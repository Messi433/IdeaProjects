package com.example.exception;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 跳转到具体的错误页面的方法
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse
            response, Object handler, Exception ex) {
        ex.printStackTrace();
        SysException e = null; // 获取到异常对象
        if (ex instanceof SysException) {
            e = (SysException) ex;
        } else {
            e = new SysException("请联系管理员");
        }
        ModelAndView mv = new ModelAndView(); // 存入错误的提示信息
        mv.addObject("errorMessage", e.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
