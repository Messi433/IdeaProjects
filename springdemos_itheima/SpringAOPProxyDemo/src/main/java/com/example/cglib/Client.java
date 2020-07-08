package com.example.cglib;

import com.example.Proxy.IProducer;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个消费者(基于子类的实现方式)
 */
public class Client {
    /**
     * 思想：在不修改原方法的前提下，增强方法功能 -→ 代理技术 -→ 这是浅显的AOP思想
     * 特点：字节码随用随创建，随用随加载.
     * 作用：不修改源码的基础上对方法增强
     * 分类：
     * 1.基于接口的动态代理
     * 2.基于子类的动态代理基于接口的动态代理:
     * 涉及的类: Enhancer
     * 提供者: 第三方cglib库
     * 如何创建代理对象:
     * 使用Enhancer类中的create方法
     * create()参数：
     * Class:字节码，用于指定被代理对象的字节码
     * Callback：用于提供增强的代码
     * 创建代理对象的要求：
     * 被代理类不能是最终类(最终类没有子类可创建，也就没有代理对象了)
     *
     * @param args
     */
    public static void main(String[] args) {
        final Producer producer = new Producer();

        Enhancer.create(producer.getClass(), new MethodInterceptor() {
            /**
             *  执行被代理对象的任何方法都会经过该方法
             *  以上三个参数，与基于接口的动态代理invoke()中的三个参数一致
             * @param proxy
             * @param method
             * @param args
             * @param methodProxy
             * @return
             * @throws Throwable
             */
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                /*提供增强的的代码:当为销售商时，则流水到销售商的钱是总价格的0.8倍*/
                Object returnValue = null;
                //1.获取方法执行的参数
                Float money = (Float) args[0];
                //2.判断当前方法是否是代理方法
                if ("sale".equals(method.getName())) {
                    // 这里注意加f，否则编译器无法识别是否为float
                    returnValue = method.invoke(producer, money * 0.8f);
                }
                return returnValue;
            }
        });
    }
}
