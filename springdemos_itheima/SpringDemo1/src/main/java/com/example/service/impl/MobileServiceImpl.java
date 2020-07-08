package com.example.service.impl;

import com.example.dao.MobileDAO;
import com.example.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "mobileService")
public class MobileServiceImpl implements MobileService {
    @Autowired
    MobileDAO mobileDAO;
    @Override
    public void funcDao() {
        System.out.println("调用dao方法");
        mobileDAO.getData();
    }
}

