package com.example;

import com.example.domain.Account;
import com.example.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MapperTest {
    @Autowired
    private AccountMapper accountMapper;
    @Test
    public void mapperTest(){
        List<Account> accounts = accountMapper.findAll();
        System.out.println(accounts);
    }
}
