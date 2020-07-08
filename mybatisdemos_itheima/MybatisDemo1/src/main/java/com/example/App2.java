package com.example;

import com.example.dao.IUserDao;
import com.example.dao.impl.UserDaoImpl;
import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class App2 {
    private InputStream in;
    private SqlSessionFactory factory;
    private IUserDao userDao;

    @Before//在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.创建 SqlSession 工厂对象
        factory = builder.build(in);
        //4.创建 Dao 接口的实现类
        userDao = new UserDaoImpl(factory);
    }
    @After//在测试方法执行完成之后执行
    public void destroy() throws Exception {
        //7.释放资源
        in.close();
    }
    @Test
    public void testFindAll() {
        List<User> users = userDao.findAllUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setUsername("mybatis dao user");
        //6.执行操作
        userDao.saveUser(user);
        System.out.println(user.getId());
    }

    @Test
    public void testFindOne() {
        //6.执行操作
        User user = userDao.findUserById(56);
        System.out.println(user);
    }


    @Test
    public void testUpdateUser() throws Exception {
        //1.根据id查询
        User user = userDao.findUserById(1);
        //2.更新操作
        user.setAddress("北京市顺义区");
        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser() throws Exception {
        //6.执行操作
        userDao.deleteUser(5);
    }

    @Test
    public void testFindTotal() throws Exception { //6.执行操作
        int res = userDao.totalCount();
        System.out.println(res);
    }

}
