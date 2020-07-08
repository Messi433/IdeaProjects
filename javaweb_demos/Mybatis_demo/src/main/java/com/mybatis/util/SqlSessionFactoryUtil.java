package com.mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: ckzh1
 * @Date: 2018/8/24 13:17
 * @Description:
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory;


    //静态代码块
    static {
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            SqlSession sqlSession =sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}
