package com.example.test;

import com.example.dao.MobileDAO;
import com.example.entity.Mobile;
import com.example.service.MobileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/*
测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class IOC_Test_1 {

//    @Autowired
//    @Qualifier("mobileDAO1")
    @Resource(name = "mobileDAO1")
    MobileDAO mobileDAO;

    @Resource(name = "mobileDAO1")
    MobileDAO mobileDAO2;

    @Test
    public void test() {
        System.out.println(mobileDAO == mobileDAO2);
    }

     /*
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        MobileService ms = (MobileService) ac.getBean("mobileService");
        Mobile mobile = ac.getBean("mobile",Mobile.class);
        System.out.println(ms);
        System.out.println(mobile);
    }
    */
}
