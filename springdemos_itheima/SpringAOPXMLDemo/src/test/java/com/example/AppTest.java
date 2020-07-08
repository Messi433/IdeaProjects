package com.example;

import static org.junit.Assert.assertTrue;

import com.example.entity.Account;
import com.example.service.AccountService;
import com.example.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:bean.xml");
    AccountService accountService = ac.getBean("accountService", AccountService.class);

    @Test
    public void test() {
        accountService.saveAccount();
    }
}
