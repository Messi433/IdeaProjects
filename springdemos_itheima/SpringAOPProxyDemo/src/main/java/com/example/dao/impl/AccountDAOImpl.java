package com.example.dao.impl;

import com.example.dao.AccountDAO;
import com.example.entity.Account;
import com.example.util.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.List;

/**
 * Spring Anno IOC CURD案例
 */
public class AccountDAOImpl implements AccountDAO {

    private QueryRunner runner;
    private ConnectionUtils connectionUtils;

    /**
     * set方法注入
     */
    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    /*
            1.这里注意两个匿名内部类BeanHandler 和 BeanListHandler
            2.try catch要加运行时异常new RuntimeException(e);，若按提示e.printStackTrace()，则最后代码块还需加返回对象
         */
    @Override
    public Account findAccountById(int id) {
        String sql = "select * from account where id = ?";
        try {
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            return runner.query(connectionUtils.getThreadConnection(), sql, new BeanHandler<Account>(Account.class), id);
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
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            List<Account> accounts = runner.query(connectionUtils.getThreadConnection(), sql, new BeanListHandler<Account>(Account.class), accountName);
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
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            return runner.query(connectionUtils.getThreadConnection(), sql, new BeanListHandler<Account>(Account.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //由于主键自增,故第一个参数是第二个sql字段
    @Override
    public void saveAccount(Account account) {
        String sql = "insert into account(name,money)values(?,?)";
        try {
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            runner.update(connectionUtils.getThreadConnection(), sql, account.getName(), account.getMoney());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateAccount(Account Account) {
        String sql = "update account set name=?,money=? where id=?";
        try {
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            runner.update(connectionUtils.getThreadConnection(), sql, Account.getName(), Account.getMoney(), Account.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccount(int id) {
        String sql = "delete from account where id=?";
        try {
            //query()，新加入第一个参数connectionUtils.getThreadConnection()
            runner.update(connectionUtils.getThreadConnection(), sql, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
