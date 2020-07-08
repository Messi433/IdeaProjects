package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring配置类，相当于bean.xml
 */
@Configuration
@ComponentScan("com.example")
@Import({JdbcConfiguration.class, TransactionManager.class})
@PropertySource("classpath:db.properties")
@EnableTransactionManagement //开启注解事务支持

public class SpringConfiguraion {
}
