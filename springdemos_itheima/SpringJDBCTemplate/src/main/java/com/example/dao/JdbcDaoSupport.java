package com.example.dao;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

/**
 * 此类用于抽取dao中的重复性代码
 */
public class JdbcDaoSupport {
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JdbcTemplate createJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
