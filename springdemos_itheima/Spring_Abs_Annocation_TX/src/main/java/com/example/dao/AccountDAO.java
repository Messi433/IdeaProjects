package com.example.dao;


import com.example.entity.Account;

import java.util.List;


public interface AccountDAO {
    public Account findAccountById(int id);
    public Account findAccountByName(String accountName);
    public List<Account> findAllAccount();
    public void saveAccount(Account account);
    public void updateAccount(Account account);
    public void deleteAccount(int id);
}
