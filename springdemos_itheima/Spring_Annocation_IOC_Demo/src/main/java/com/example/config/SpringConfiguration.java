package com.example.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 独立的配置类效果等同于bean.xml
 * SpringConfiguration为父配置类
 */

//@Configuration
//basepackges 别名 values
//@ComponentScan(basePackages = {"com.com.example.example"})
//@ComponentScan("com.com.example.example")

@ComponentScan({"com.example","com.example.config"})
@Import(JdbcConfigration.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
