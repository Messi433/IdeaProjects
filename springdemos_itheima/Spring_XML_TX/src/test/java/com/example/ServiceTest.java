package com.example;

import com.example.dao.AccountDAO;
import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:bean.xml")
public class ServiceTest {
    @Autowired
    AccountService accountService;
    @Test
    public void DaoTest(){
        accountService.transfer("李白","王五",500.00);
    }
}
