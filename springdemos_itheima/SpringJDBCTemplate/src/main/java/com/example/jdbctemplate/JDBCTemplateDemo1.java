package com.example.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 无容器原生实现
 */
public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/javastudy?serverTimezone=GMT&useUnicode=true&characerEncoding=utf-8&useSSL=true");
        ds.setUsername("root");
        ds.setPassword("k1234567");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(ds);
        String sql = "insert into account(name,money) values('王五',2000.00)";
        jdbcTemplate.execute(sql);
    }
}
