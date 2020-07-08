package com.example.dao.impl;

import com.example.dao.AccountDAO;
import com.example.dao.JdbcDaoSupport;
import com.example.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 通过继承自定义JdbcDaoSupport类，减少重复性代码
 */
@Repository
public class AccountDAOImpl2 extends JdbcDaoSupport implements AccountDAO {

    private Account account;
    private List<Account> accounts;

    @Override
    public Account findAccountById(int accountId) {
        String sql = "select * from account where id=?";
        accounts = super.getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Account>(Account.class), accountId);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public Account findAccountByName(String accountName) {
        String sql = "select * from account where name = ?";
        accounts = super.getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Account>(Account.class), accountName);
        if (accounts.isEmpty())
            return null;
        if (accounts.size() > 1)
            throw new RuntimeException("结果集不唯一");
        return accounts.get(0);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        accounts = super.getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }

    //由于主键自增,故第一个参数是第二个sql字段
    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account(name,money)values(?,?)";
        super.getJdbcTemplate().update(sql, account.getName(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set name=?,money=? where id=?";
        super.getJdbcTemplate().update(sql, account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        super.getJdbcTemplate().update(sql, id);
    }
}