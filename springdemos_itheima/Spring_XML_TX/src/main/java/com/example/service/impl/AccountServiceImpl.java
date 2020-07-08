package com.example.service.impl;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDAO accountDAO;

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
        Account account = accountDAO.findAccountById(id);
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("执行保存");
//        int i = 1/0;
        accountDAO.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("执行更新");
        accountDAO.updateAccount(account);
    }

    /**
     * 事务思想的案例
     *
     * @param sourceName 转出账户
     * @param targetName 转入账户
     * @param money      金额
     *                   根据名称查询转出账户-->根据名称查询转入账户-->转出账户减钱-->转入账户加钱-->更新转出账户和转入账户
     */
    @Override
    public void transfer(String sourceName, String targetName, double money) {
        //2.1 根据名称查询转出账户
        Account source = accountDAO.findAccountByName(sourceName);
        //2.2 根据名称查询转入账户
        Account target = accountDAO.findAccountByName(targetName);
        //2.3 转出账户减钱
        source.setMoney(source.getMoney() - money);
//        int i = 1/0;
        //2.4 转入账户加钱
        target.setMoney(target.getMoney() + money);
        //2.5 更新转出账户
        accountDAO.updateAccount(source);
        //int a = 1 / 0;
        //2.6 更新转入账户
        accountDAO.updateAccount(target);
        System.out.println("转账成功");
    }
}

