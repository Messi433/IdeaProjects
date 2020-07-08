package com.example;

import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class AccountTest {
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    AccountService accountService= (AccountService) ac.getBean("accountService",AccountService.class);
    @Test
    public void test(){
        accountService.transfer("李白","张三",500.00);
    }
}
