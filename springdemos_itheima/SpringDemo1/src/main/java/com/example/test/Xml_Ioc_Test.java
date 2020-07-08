package com.example.test;

import com.example.entity.Mobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Xml_Ioc_Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("xml_bean.xml");
        Mobile mobile = ac.getBean("mobile", Mobile.class);
        System.out.println(mobile.getName());
    }
}
