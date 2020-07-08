package com.example.service.impl;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import com.example.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;

    //set方法注入
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }


    @Override
    public Account findAccountByName(String accountName) {
        return accountDAO.findAccountByName(accountName);
    }

    @Override
    public List<Account> findAllAccount() {
        List<Account> accounts = accountDAO.findAllAccount();
        return accounts;
    }

    public Account findAccountById(int id) {
        System.out.println("执行按照id查找");
//        Account account = accountDAO.findAccountById(id);
        return null;
    }

    @Override
    public void saveAccount() {
        System.out.println("执行保存");
//        int i = 1/0;
//        accountDAO.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("执行更新");
//        accountDAO.updateAccount(account);
    }

}

