package com.mybatis.test;

import com.mybatis.entity.Order;
import com.mybatis.entity.OrderUser;
import com.mybatis.entity.User;
import com.mybatis.mapper.OrderMapper;
import com.mybatis.mapper.UserMapper;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/27 11:02
 * @Description:
 */
public class MybatisMapperTest {
    @Test
    public void test(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
   //OrderList-sql与pojo字段不一致时的测试
    public void test2(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList=orderMapper.queryOrderAll();
        for (Order order: orderList
             ) {
            System.out.println(order);
        }
        sqlSession.close();
    }
    @Test
    //sql-where-if标签测试
    public void test3(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        Order order = new Order();
        User user = new User();
        user.setUsername("zhang");
        user.setPassword("");
        order.setUser(user);

        List<User> userList = userMapper.queryUserByName(user);

        for (User user2:userList
             ) {
            System.out.println(user2);
        }
    }
    @Test
    //sql-foreach标签测试
    public void test4(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        Order order = new Order();
        order.setIds(Arrays.asList(1,3,5));
        List<User> userList =  userMapper.queryUserByIds(order);

        for (User user:userList
                ) {
            System.out.println(user);
        }
    }
    //一对一关联查询resultType
    @Test
    public void test5(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> orderUserList=orderMapper.queryOrderUser();
        System.out.println(orderUserList);

    }
    //一对一关联查询resultMap
    @Test
    public void test6(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList=orderMapper.queryOrderUserByResultMap();
        for (Order order:orderList
             ) {
            System.out.println(order);
            System.out.println(order.getUser());

        }
    }
    //一对多关联查询resultMap
    @Test
    public void test7(){
        SqlSessionFactory sqlSessionFactory =SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<User> userList=orderMapper.queryUserOrderByResultMap();
        for (User user:userList
                ) {
            System.out.println(user);

            if (user.getOrder_id()!=0){
                for (Order order:user.getOrderList()
                        ) {
                    System.out.println("此用户的订单是"+order);
                }
            }

        }
    }


}
