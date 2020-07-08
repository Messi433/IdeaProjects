package com.example.service;

import com.example.bean.PageBean;
import com.example.bean.User;
import com.example.dao.UserDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Service {
    UserDao userDao = null;
    ArrayList<User> allUser = null;
    int totalRecord = 0;

    public PageBean<User> findAllUserWithPage(int pageNum,int pageSize) throws SQLException {
        userDao = new UserDao();
        allUser = userDao.findAllUser();
        //获得记录数
        totalRecord = allUser.size();
        //有了三个初始数据就可以创建pageBean对象了
        PageBean pageBean = new PageBean(pageNum,pageSize,totalRecord);

        return  pageBean;
    }

}
