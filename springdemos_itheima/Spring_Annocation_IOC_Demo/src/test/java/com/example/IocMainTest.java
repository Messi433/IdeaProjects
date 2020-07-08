package com.example;

import com.example.config.SpringConfiguration;
import com.example.dao.MobileDAO;
import com.example.entity.Mobile;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * 使用注解加载配置类
 */
public class IocMainTest {


    public static void main(String[] args) {
        /**
         * AnnotationConfigApplicationContext()不加参数则相关配置类必须要有@Configration注解&&配置扫描包@ComponentScan
         * AnnotationConfigApplicationContext()加参数[配置类.class]，则相当于告知容器，这个类是我要加载的配置类
         */
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MobileDAO mobileDAO = ac.getBean("mobileDAO",MobileDAO.class);
        List<Mobile> mobileList = mobileDAO.getAll();
        for ( Mobile mobile: mobileList
             ) {
            System.out.println(mobile.getName());
        }
    }

    @Test
    public void test(){
        /**
         * AnnotationConfigApplicationContext()不加参数则相关配置类必须要有@Configration注解&&配置扫描包@ComponentScan
         * AnnotationConfigApplicationContext()加参数[配置类.class]，则相当于告知容器，这个类是我要加载的配置类
         */
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        QueryRunner runner = (QueryRunner) ac.getBean("runner");
        System.out.println(runner);

    }

}
