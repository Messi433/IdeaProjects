package com.example.dao.impl;

import com.example.dao.IUserDao;
import com.example.domain.QueryVo;
import com.example.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;
    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }
    @Override
    public List<User> findAllUser() {
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("com.itheima.dao.IUserDao.findAll");
        session.close();
        return users;
    }
    @Override
    public void saveUser(User user) {
        SqlSession session = factory.openSession();
        int res = session.insert("com.itheima.dao.IUserDao.saveUser", user);
        session.commit();
        session.close();
    }
    @Override
    public User findUserById(int userId) {
        SqlSession session = factory.openSession();
        User user = session.selectOne("com.itheima.dao.IUserDao.findById", userId);
        session.close();
        return user;
    }

    @Override
    public List<User> findUserByName(String username) {
        return null;
    }

    @Override
    public void updateUser(User user) {
        SqlSession session = factory.openSession();
        int res = session.update("com.itheima.dao.IUserDao.updateUser", user);
        session.commit();
        session.close();
    }

    @Override
    public void deleteUser(int userId) {
        SqlSession session = factory.openSession();
        int res = session.delete("com.itheima.dao.IUserDao.deleteUser", userId);
        session.commit();
        session.close();
    }

    @Override
    public int totalCount() {
        SqlSession session = factory.openSession();
        int res = session.selectOne("com.itheima.dao.IUserDao.findTotal");
        session.close();
        return res;
    }

    @Override
    public List<User> findByVo(QueryVo vo) {
        return null;
    }

    @Override
    public List<User> findUserByCondition(User user) {
        return null;
    }

    @Override
    public List<User> findUserInIds(QueryVo vo) {
        return null;
    }
}
