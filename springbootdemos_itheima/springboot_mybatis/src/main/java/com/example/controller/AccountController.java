package com.example.controller;

import com.example.domain.Account;
import com.example.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;
    @RequestMapping("findall")
    @ResponseBody
    public List<Account> findAllAccount(){
        List<Account> accounts = accountMapper.findAll();
        return accounts;
    }
}
