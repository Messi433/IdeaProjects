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
public class DaoTest {
    @Autowired
    AccountDAO accountDAO;
    @Test
    public void DaoTest(){
        System.out.println();
    }
}
