package com.example;

import com.example.dao.IRoleDao;
import com.example.dao.IUserDao;
import com.example.domain.Role;
import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class App {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;
    private IRoleDao roleDao;

    @Test
    public void testFindAllRole() {
        List<Role> roles = roleDao.findAll();
        for (Role role : roles) {
            System.out.println("----------角色列表-------");
            System.out.println(role);
            List<User> users = role.getUsers();
            for (User user: users) {
                System.out.println("----------角色映射列表-------");
                System.out.println(user);
            }
        }
    }

    @Test
    public void testFindAllUser() {
        List<User> users = userDao.findAll();
        System.out.println(users);
        /*for (User user : users) {
            System.out.println("----------用户列表-------");
            System.out.println(user);
            List<Role> Roles = user.getRoles();
            for (Role role : Roles) {
                System.out.println("----------用户账户列表-------");
                System.out.println(account);
            }
        }*/
    }

    /**
     * 配置代码的封装
     *
     * @throws Exception
     */
    @Before
    public void init() throws Exception {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3.使用工厂生产SqlSession对象,openSession(true),则为自动提交事务，不需要加session.commit();
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(IUserDao.class);
        roleDao = session.getMapper(IRoleDao.class);
    }

    @After
    public void destory() throws Exception {
        //5.提交事务
        session.commit();
        //6.释放资源
        session.close();
        in.close();
    }


}
