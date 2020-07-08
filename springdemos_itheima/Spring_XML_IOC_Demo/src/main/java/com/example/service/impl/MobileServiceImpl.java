package com.example.service.impl;

import com.example.dao.MobileDAO;
import com.example.entity.Mobile;
import com.example.service.MobileService;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

public class MobileServiceImpl implements MobileService {

    ApplicationContext ac = new ClassPathXmlApplicationContext("xml_bean.xml");
    MobileDAO mobileDAO = ac.getBean("mobileDAO",MobileDAO.class);

    public void setMobileDAO(MobileDAO mobileDAO) {
        this.mobileDAO = mobileDAO;
    }

    @Override
    public Mobile get(int id) {
        Mobile mobile = new Mobile();
        mobile.setId(1);
        mobile.setName("hhh");
        mobile.setType("bbb");
        return mobile;
    }

    @Override
    public List<Mobile> getAll() {
        return null;
    }
}

