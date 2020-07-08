package com.example.jdbctemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 框架test
 */

@ContextConfiguration("classpath:bean.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JDBCTemplateDemo2 {

    @Autowired
    DriverManagerDataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void test(){
        String sql = "insert into account(name,money) values('王五',2000.00)";
        jdbcTemplate.execute(sql);
    }
}
