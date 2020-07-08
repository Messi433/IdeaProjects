package com.mybatis.test;

import com.mybatis.dao.UserDAO;
import com.mybatis.dao.UserDAOImpl;
import com.mybatis.entity.User;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.junit.Test;

import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/24 22:27
 * @Description:
 */
public class MybatisDaoTest {
      UserDAO userDAO =new UserDAOImpl(SqlSessionFactoryUtil.getSqlSessionFactory());
      @Test
      public void test(){
        /*  User user =new User();
          user.setId(15);
          user.setUsername("test222");
          user.setPassword("test2222");
          userDAO.updateUserById(user);*/

        /*  List<User> list = userDAO.getUserByName("zhang");
          for (User user:list
               ) {
              System.out.println(user);

          }*/
      }
}
