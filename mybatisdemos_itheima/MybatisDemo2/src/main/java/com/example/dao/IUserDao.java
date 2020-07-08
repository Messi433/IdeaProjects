package com.example.dao;

import com.example.domain.QueryVo;
import com.example.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    public List<User> findAll();
    public User findById(int id);
    public List<User> findByName(String username);
    public void saveUser(User user);
    public void updateUser(User user);
    public void deleteUser(int userId);
    public List<User> findByVo(QueryVo vo);
    public List<User> findByCondition(User user);
    List<User> findInIds(QueryVo vo);

}
