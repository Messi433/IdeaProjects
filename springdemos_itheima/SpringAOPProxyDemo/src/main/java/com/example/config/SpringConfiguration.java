package com.example.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

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
