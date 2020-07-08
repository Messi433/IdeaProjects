package com.example.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个消费者
 */
public class Client {
    /**
     * 思想：在不修改原方法的前提下，增强方法功能 -→ 代理技术 -→ 这是浅显的AOP思想
     * 特点：字节码随用随创建，随用随加载.
     * 作用：不修改源码的基础上对方法增强
     * 分类：
     * 1.基于接口的动态代理
     * 2.基于子类的动态代理基于接口的动态代理:
     * 涉及的类: Proxy
     * 提供者: JDK官方
     * 如何创建代理对象:
     *      1.使用Proxy类中的newProxyInstance方法创建代理对象的要求:
     *      2.被代理类最少实现一个接口，如果没有则不能使用newProxyInstance方法的参数:
     *          ClassLoader:类加载器，它是用于加载代理对象字节码的。和被代理对象使用相同的类加载器(固定写法)
     *          Class[]:字节码数组，它是用于让代理对象和被代理对象有相同方法(固定写法)
     *          InvocationHandler:用于提供增强的代码，它是让我们写如何代理,我们一般都是些接口的实现类，通常情况下都是匿名内部类，
     *          但不是必须此接口的实现类都是谁用谁写。
     *
     * @param args
     */
    public static void main(String[] args) {
        final Producer producer = new Producer();
        producer.sale(5000);
        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(), new InvocationHandler() {
                    /**
                     * 作用：执行被代理对象的任何接口方法都会经过该方法
                     * @param proxy 代理对象的引用
                     * @param method 当前执行的方法
                     * @param args 当前执行方法所需的参数
                     * @return     和被代理对象有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*提供增强的的代码:当为销售商时，则流水到销售商的钱是总价格的0.8倍*/
                        Object returnValue = null;
                        //1.获取方法执行的参数
                        Float money = (Float) args[0];
                        //2.判断当前方法是否是代理方法
                        if ("sale".equals(method.getName())){
                            // 这里注意加f，否则编译器无法识别是否为float
                            returnValue = method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
    }
}
