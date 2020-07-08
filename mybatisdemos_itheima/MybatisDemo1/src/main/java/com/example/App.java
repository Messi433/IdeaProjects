package com.example;

import com.example.dao.IUserDao;
import com.example.domain.QueryVo;
import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    private InputStream in;
    private SqlSessionFactoryBuilder builder;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;

    @Test
    public void testFindUserByCondition() {
        User user = new User();
//        user.setUsername("老王");
        user.setSex("男");
        List<User> users = userDao.findUserByCondition(user);
        for (User u : users) {
            System.out.println(u);
        }
    }
    @Test
    public void testFindUserInIds(){
        QueryVo vo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(3);
        ids.add(4);
        vo.setIds(ids);
        List<User> users = userDao.findUserInIds(vo);
        for (User u : users) {
            System.out.println(u);
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
