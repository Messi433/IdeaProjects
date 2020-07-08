package com.mybatis.test;

import com.mybatis.entity.User;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/23 14:42
 * @Description:
 */
public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory;
    @Test
    public void test() throws Exception {
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder =  new SqlSessionFactoryBuilder();
        //创建核心配置文件的输入流对象
        InputStream inputStream  = Resources.getResourceAsStream("mybatis.xml");
        //通过输入流对象创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=sqlSessionFactoryBuilder.build(inputStream);
        //SqlSessionFactory(工厂)对象创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        /*执行sql语句*/
        //查询
        User user=sqlSession.selectOne("user.getUserById",1);
        System.out.println(user);
        //释放资源
        sqlSession.close();
    }

    @Test
    public void test2(){
      sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
      SqlSession sqlSession=sqlSessionFactory.openSession();

        User user =null;
      //返回list
       /* List<User> list  = sqlSession.selectList("user.getUserByName","zhang");
        for (User user:list
             ) {
            System.out.println(user);
        }
        */
       user= new User();
       user.setUsername("kkk4");
       user.setPassword("huhu4");

       sqlSession.insert("insertUser",user);
       //user并没有设置主键而打印user对象却有id
       System.out.println(user);
       //需要进行事务提交
       sqlSession.commit();
       //释放资源
       sqlSession.close();

    }
    @Test
    public void test3(){
        sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = null;

        user = new User();

        user.setId(14);
        user.setUsername("yyy4");
        user.setPassword("uuu4");

        sqlSession.update("user.updateUser",user);
        //事务提交
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    @Test
    public void test4(){
        sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.delete("user.deleteUser",14);

        sqlSession.commit();
        sqlSession.close();

    }

}
