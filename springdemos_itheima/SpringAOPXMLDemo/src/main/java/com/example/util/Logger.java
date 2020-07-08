package com.example.util;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于日志记录的工具类，其中提供了公共的代码
 */
public class Logger {
    /**
     * 前置通知
     */
    public void beforePrintlog() {
        System.out.println("前置通知-Logger类的beforePrintlog()开始记录日志");
    }

    /**
     * 后置通知
     */
    public void afterReturningPrintlog() {
        System.out.println("后置通知-Logger类的afterReturningPrintlog()开始记录日志");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrintlog() {
        System.out.println("异常通知-Logger类的afterThrowingPrintlog()开始记录日志");
    }

    /**
     * 最终通知
     */
    public void afterPrintlog() {
        System.out.println("最终通知-Logger类的afterPrintlog()开始记录日志");
    }

    /**
     * 环绕通知
     */
    public Object aroundPrintlog(ProceedingJoinPoint pjp){
        //这里要抛一个大异常Throwable,小的拦不住😁
        try {
            Object rtValue = null;
            Object[] args = pjp.getArgs();//得到方法执行的参数
            System.out.println("环绕通知-Logger类的aroundPrintlog()开始记录日志 -→ 前置通知\uD83D\uDE01");
            rtValue = pjp.proceed(args);//明确调用业务层方法(切入点方法)
            System.out.println("环绕通知-Logger类的aroundPrintlog()开始记录日志 -→ 后置通知");
            return rtValue;
        } catch (Throwable throwable) {
            System.out.println("环绕通知-Logger类的aroundPrintlog()开始记录日志 -→ 异常通知");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("环绕通知-Logger类的aroundPrintlog()开始记录日志 -→ 最终通知");
        }



    }
}
