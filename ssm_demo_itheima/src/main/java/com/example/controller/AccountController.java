package com.example.controller;

import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("findAll")
    public ModelAndView findAll() {
        System.out.println("查询所有账户Controller");
        ModelAndView mv = new ModelAndView();
        List<Account> accounts = accountService.findAll();
        mv.addObject("accounts",accounts);
        mv.setViewName("list");
        return mv;
    }
    @RequestMapping("save")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "success";
    }
}
