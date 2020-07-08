package com.example.service.impl;

import com.example.dao.MobileDAO;
import com.example.entity.Mobile;
import com.example.service.MobileService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mobileService")
public class MobileServiceImpl implements MobileService {

    @Autowired
    MobileDAO mobileDAO;

    @Override
    public Mobile get(int id) {
        return null;
    }

    @Override
    public List<Mobile> getAll() {
        return null;
    }

}

