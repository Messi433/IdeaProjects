package com.example;

import com.example.entity.Mobile;
import com.example.service.MobileService;
import com.example.service.impl.MobileServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTest {
    @Test
    public void testGet() {
        //容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("xml_bean.xml");
        //调用业务层
        MobileService ms = ac.getBean("mobileService", MobileService.class);
        //执行
        Mobile mobile = ms.get(1);

        System.out.println(mobile);
    }

    @Test
    public void testGetAll() {

    }

}
