package com.example.dao.impl;

import com.example.dao.AccountDAO;
import com.example.dao.AccountDAO;
import com.example.entity.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * Spring Anno IOC CURD案例
 */
@Repository("AccountDAO")
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private QueryRunner runner;

    /*
    1.这里注意两个匿名内部类BeanHandler 和 BeanListHandler
    2.try catch要加运行时异常new RuntimeException(e);，若按提示e.printStackTrace()，则最后代码块还需加返回对象
     */
    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id = ?";
        try {
            return runner.query(sql, new BeanHandler<Account>(Account.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据name返回单个对象，若查询出多个对象则抛异常；
     *
     * @param accountName
     * @return
     */
    @Override
    public Account findAccountByName(String accountName) {
        String sql = "select * from account where name = ?";
        try {
            List<Account> accounts = runner.query(sql, new BeanListHandler<Account>(Account.class), accountName);
            if (accounts == null || accounts.size() == 0)
                return null;
            else if (accounts.size() > 1) {
                throw new RuntimeException("错误：数据不唯一！");
            }
            return accounts.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        try {
            return runner.query(sql, new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //由于主键自增,故第一个参数是第二个sql字段
    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account(name,money)values(?,?)";
        try {
            runner.update(sql, account.getName(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account Account) {
        String sql = "update account set name=?,money=? where id=?";
        try {
            runner.update(sql, Account.getName(), Account.getMoney(), Account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        try {
            runner.update(sql, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
