package com.example.dao.impl;

import com.example.dao.MobileDAO;
import com.example.entity.Mobile;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;
import java.util.List;

/**
 * Spring XML IOC CURD案例
 */

public class MobileDAOImpl implements MobileDAO {

    private QueryRunner runner;
    ApplicationContext ac = new ClassPathXmlApplicationContext("xml_bean.xml");
    MobileDAO mobileDAO = ac.getBean("mobileDAO", MobileDAO.class);

    /*
    1.这里注意两个匿名内部类BeanHandler 和 BeanListHandler
    2.try catch要加运行时异常new RuntimeException(e);，若按提示e.printStackTrace()，则最后代码块还需加返回对象
     */
    @Override
    public Mobile get(int id) {
        String sql = "select * from mobile where id = ?";
        try {
            return runner.query(sql, new BeanHandler<Mobile>(Mobile.class), id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Mobile> getAll() {
        String sql = "select * from mobile";
        try {
            return runner.query(sql,new BeanListHandler<Mobile>(Mobile.class));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //由于主键自增,故第一个参数是第二个sql字段
    @Override
    public void save(Mobile mobile) {
        String sql = "insert into mobile(name,type)values(?,?)";
        try {
            runner.update(sql,mobile.getName(),mobile.getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Mobile mobile) {
        String sql = "update mobile set name=? type=? where id=?";
        try {
            runner.update(sql,mobile.getName(),mobile.getName(),mobile.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "delete from mobile where id=?";
        try {
            runner.update(sql,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setRunner(QueryRunner runner) {

    }
}
