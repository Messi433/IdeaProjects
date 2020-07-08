package com.example;

import com.example.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Class API：Method对象
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //获取指定名称的方法
        Method eatMethod = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eatMethod.invoke(p);
        //获得方法带参数
        Method eatMethod2 = personClass.getMethod("eat", String.class);
        //执行方法
        eatMethod2.invoke(p, "饭");
        System.out.println("--------------");
        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);
        }
    }
}
