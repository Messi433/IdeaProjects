package com.example.service;

import com.example.entity.Account;

import java.util.List;

/**
 * Spring学习测试
 */
public interface AccountService {
    public Account findAccountById(int id);

    public Account findAccountByName(String accountName);

    public List<Account> findAllAccount();

    public void saveAccount(Account account);

    public void updateAccount(Account account);

    public void transfer(String sourceName, String targetName, double money);

}
