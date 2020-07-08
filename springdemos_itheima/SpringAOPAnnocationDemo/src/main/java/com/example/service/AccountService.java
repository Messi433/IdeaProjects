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

    public void saveAccount();

    public void updateAccount(Account account);

}
