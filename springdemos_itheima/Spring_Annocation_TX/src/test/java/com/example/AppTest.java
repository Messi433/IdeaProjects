package com.example;

import static org.junit.Assert.assertTrue;

import com.example.entity.Account;
import com.example.service.AccountService;
import com.example.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:bean.xml")
public class AppTest {
    @Autowired
    AccountService accountService;

    @Test
    public void test() {
        accountService.transfer("李白","王五",500);
    }
}
