package com.example;

import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * 动态代理在银行案例中的实现，测试类
 */
public class ProxyAccountServiceTest {
    /*
    @Autowired
    @Qualifier("proxyAccountService")
    */
    @Resource(name = "proxyAccountService")
    private AccountService accountService;
}
