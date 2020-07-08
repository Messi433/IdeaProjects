package com.example.jdbctemplate;

import com.example.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * CURD操作
 */

@ContextConfiguration("classpath:bean.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JDBCTemplateDemo3 {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
//        List<Account> accounts = getAll();
//        for (Account account:accounts) {
//            System.out.println(account);
//        }

//        Account account = getAccountById(2);
//        System.out.println(account);

//        List<Account> accounts = getAll2();
//        for (Account account:accounts) {
//            System.out.println(account);
//        }
        System.out.println(getCount());
    }

    @Test
    public void save() {
        //增加
        String sql = "insert into account(name,money) values(?,?)";
        jdbcTemplate.update(sql, "张湾", 2000.00);
    }

    @Test
    public void update() {
        //增加
        String sql = "update account set name=?,money=? where id=?";
        jdbcTemplate.update(sql, "王五", 1000.00, 4);
    }

    @Test
    public void delete() {
        //增加
        String sql = "delete from account where id=?";
        jdbcTemplate.update(sql, 12);
    }


    //查询所有方法1
    public List<Account> getAll() {
        List<Account> accounts = null;
        String sql = "select * from account";
        accounts = jdbcTemplate.query(sql, new MyRowMapper());
        return accounts;
    }

    //查询所有方法2
    public List<Account> getAll2() {
        String sql = "select * from account";
        List<Account> accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }

    //通过id查询
    public Account getAccountById(int id) {
        List<Account> accounts = null;
        String sql = "select * from account where id=?";
        accounts = jdbcTemplate.query(sql, new MyRowMapper(), id);
        return accounts.get(0);
    }
    //查询返回一行一列
    public Long getCount(){
        String sql = "select count(*) from account";
        //一般都是返回长整形，以免长度不够无法强转
        Long count = jdbcTemplate.queryForObject(sql,Long.class);
        return count;
    }

}

class MyRowMapper implements RowMapper<Account> {

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setId(rs.getInt(1));
        account.setName(rs.getString(2));
        account.setMoney(rs.getDouble(3));
        //或者写成
//        account.setId(rs.getInt("id"));
//        account.setName(rs.getString("name"));
//        account.setMoney(rs.getDouble("money"));
        return account;
    }
}
