package com.example.service.impl;

import com.example.dao.AccountDAO;
import com.example.dao.MobileDAO;
import com.example.entity.Account;
import com.example.entity.Mobile;
import com.example.service.AccountService;
import com.example.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO accountDAO;

    @Override
    public Account findAccountById(int id) {
        return accountDAO.findAccountById(id);
    }

    @Override
    public Account findAccountByName(String accountName) {
        return accountDAO.findAccountByName(accountName);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDAO.findAllAccount();
    }

    @Override
    public void saveAccount(Account account) {
        accountDAO.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
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
        Account source = accountDAO.findAccountByName(sourceName);
        Account target = accountDAO.findAccountByName(targetName);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        accountDAO.updateAccount(source);
        int a = 1/0;
        accountDAO.updateAccount(target);
    }
}

