package com.example;

import com.example.config.SpringConfiguration;
import com.example.dao.MobileDAO;
import com.example.dao.impl.MobileDAOImpl;
import com.example.entity.Account;
import com.example.entity.Mobile;

import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class IocJunitTest {
    @Autowired
    AccountService accountService;

    @Test
    public void accountServiceTest() {
//        System.out.println(accountService.findAccountById(1));
//        System.out.println(accountService.findAllAccount());
        System.out.println(accountService.findAccountByName("李白").getMoney());

    }

    @Test
    public void setAccountServiceTest2() {
        accountService.transfer("李白", "王武", 500.00);
        //测试新结果
        System.out.println(accountService.findAccountByName("李白").getMoney());
    }

}
