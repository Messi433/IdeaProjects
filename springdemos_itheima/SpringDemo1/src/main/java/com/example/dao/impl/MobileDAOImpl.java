package com.example.dao.impl;

import com.example.dao.MobileDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  Spring学习测试
 */

//@Repository
@Repository("mobileDAO1")
//@Scope("prototype")
public class MobileDAOImpl implements MobileDAO {
    @PostConstruct
    public void init(){
        System.out.println("初始化方法执行了");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁方法执行了");
    }
    @Override
    public void getData() {        System.out.println("打印手机数据库数据111");
    }
}
