package com.example;

import com.example.dao.IAccountDao;
import com.example.dao.IUserDao;
import com.example.domain.Account;
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
    private IAccountDao accountDao;

    @Test
    public void testFindAllAccount() {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAllUser() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("----------用户列表-------");
            System.out.println(user);
            List<Account> accounts = user.getAccounts();
            for (Account account : accounts) {
                System.out.println("----------用户账户列表-------");
                System.out.println(account);
            }
        }
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
        accountDao = session.getMapper(IAccountDao.class);
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
