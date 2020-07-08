package com.example;

import com.example.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Class API：Constructor构造对象
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        // Constructor API
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);
        System.out.println("----------");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);
        //空参构造方法用Class自带(已经弃用)
        Object o = personClass.newInstance();
        System.out.println(o);
    }
}
