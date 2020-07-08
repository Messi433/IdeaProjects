package com.mybatis.dao;

import com.mybatis.entity.User;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/24 22:00
 * @Description:
 */
public interface UserDAO {
    public void addUser(User user);
    public User getUserById(int id);
    public List<User> getUserByName(String name);
    public void updateUserById(User user);
    public void deleteUser(int id);
}
