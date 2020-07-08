package com.example.dao.impl;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JdbcTemmplate CURD实现类1
 * 通过注解方式，注入bean.xml中配置的JdbcTemplate实现JdbcTemplate的调用
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private List<Account> accounts;

    @Override
    public Account findAccountById(int accountId) {
        String sql = "select * from account where id=?";
        accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), accountId);
        return accounts.isEmpty() ? null : accounts.get(0);
    }

    @Override
    public Account findAccountByName(String accountName) {
        String sql = "select * from account where name = ?";
        accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), accountName);
        if (accounts.isEmpty())
            return null;
        if (accounts.size() > 1)
            throw new RuntimeException("结果集不唯一");
        return accounts.get(0);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from account";
        accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }

    //由于主键自增,故第一个参数是第二个sql字段
    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account(name,money)values(?,?)";
        jdbcTemplate.update(sql, account.getName(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        String sql = "update account set name=?,money=? where id=?";
        jdbcTemplate.update(sql, account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        jdbcTemplate.update(sql, id);
    }
}