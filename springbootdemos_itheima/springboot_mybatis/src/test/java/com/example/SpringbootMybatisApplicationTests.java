package com.example;

import com.example.domain.Account;
import com.example.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    void contextLoads() {
        List<Account> accounts = accountMapper.findAll();
		System.out.println(accounts);
    }

}
