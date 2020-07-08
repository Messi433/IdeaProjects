package com.mybatis.mapper;

import com.mybatis.entity.Order;
import com.mybatis.entity.User;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/24 22:00
 * @Description:
 */
/**
 *
 * 功能描述: 使用mybatis动态代理
 * @auther: ckzh1
 * @date: 2018/8/27 10:54
 * @Description:
 */
public interface UserMapper {
    public void addUser(User user);
    public User getUserById(Integer id);
    public List<User> getUserByName(String name);
    public void updateUserById(User user);
    public void deleteUser(int id);
    public List<User> queryUserByName(User user);
    public List<User> queryUserByIds(Order order);
}
