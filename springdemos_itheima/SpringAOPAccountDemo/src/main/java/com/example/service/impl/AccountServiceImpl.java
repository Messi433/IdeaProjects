package com.example.service.impl;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import com.example.service.AccountService;
import com.example.util.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDAO accountDAO;
    private TransactionManager transactionManager;

    //set方法注入
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public Account findAccountById(int id) {
        try {
            //1.开启事务
            transactionManager.beginTransaction();
            //2.执行操作
            Account account = accountDAO.findAccountById(id);
            //3.提交事务
            transactionManager.commit();
            //4.返回结果
            return account;
        } catch (Exception e) {
            //5.回滚操作
            transactionManager.rollback();
            throw new RuntimeException(e);
        } finally {
            //6.释放连接
            transactionManager.release();
        }
    }

    @Override
    public Account findAccountByName(String accountName) {
        return accountDAO.findAccountByName(accountName);
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            //1.开启事务
            transactionManager.beginTransaction();
            //2.执行操作
            List<Account> accounts = accountDAO.findAllAccount();
            //3.提交事务
            transactionManager.commit();
            //4.返回结果
            return accounts;
        } catch (Exception e) {
            //5.回滚操作
            transactionManager.rollback();
            throw new RuntimeException(e);
        } finally {
            //6.释放连接
            transactionManager.release();
        }


    }

    @Override
    public void saveAccount(Account account) {
        try {
            //1.开启事务
            transactionManager.beginTransaction();
            //2.执行操作
            accountDAO.saveAccount(account);
            //3.提交事务
            transactionManager.commit();
            //4.返回结果
        } catch (Exception e) {
            //4.回滚操作
            transactionManager.rollback();
        } finally {
            //5.释放连接
            transactionManager.release();
        }
    }

    @Override
    public void updateAccount(Account account) {
        try {
            //1.开启事务
            transactionManager.beginTransaction();
            //2.执行操作
            accountDAO.updateAccount(account);
            //3.提交事务
            transactionManager.commit();
            //4.返回结果
        } catch (Exception e) {
            //5.回滚操作
            transactionManager.rollback();
        } finally {
            //6.释放连接
            transactionManager.release();
        }
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
        try {
            //1.开启事务
            transactionManager.beginTransaction();
            //2.执行操作
            //2.1 根据名称查询转出账户
            Account source = accountDAO.findAccountByName(sourceName);
            //2.2 根据名称查询转入账户
            Account target = accountDAO.findAccountByName(targetName);
            //2.3 转出账户减钱
            source.setMoney(source.getMoney() - money);
            //2.4 转入账户加钱
            target.setMoney(target.getMoney() + money);
            //2.5 更新转出账户
            accountDAO.updateAccount(source);
            //int a = 1 / 0;
            //2.6 更新转入账户
            accountDAO.updateAccount(target);
        } catch (Exception e) {
            //5.回滚操作
            transactionManager.rollback();
        } finally {
            //6.释放连接
            transactionManager.release();
        }
    }
}

