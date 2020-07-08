package com.mybatis.dao;

import com.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/24 22:01
 * @Description:
 */
public class UserDAOImpl implements UserDAO {
    private SqlSessionFactory sqlSessionFactory;
    private User user;
    public UserDAOImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void addUser(User user) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        sqlSession.insert("user.insertUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public User getUserById(int id) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        user=sqlSession.selectOne("user.getUserById",id);
        sqlSession.close();

        return user;
    }

    @Override
    public List<User> getUserByName(String name) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        List<User> list=sqlSession.selectList("user.getUserByName",name);
        return list;
    }

    @Override
    public void updateUserById(User user) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        sqlSession.update("user.updateUser",user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(int id) {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        sqlSession.delete("user.deleteUser",id);
        sqlSession.commit();
        sqlSession.close();
    }
}
