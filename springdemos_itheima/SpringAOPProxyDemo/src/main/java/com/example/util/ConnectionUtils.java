package com.example.util;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 连接工具类
 */
public class ConnectionUtils {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

    private DataSource dataSource;
    //set方法注入
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //获取当前线程的连接
    public Connection getThreadConnection() {
        //1.先从ThreadLocal上获取
        Connection connection = threadLocal.get();
        //2.判断当前线程是否有连接
        try {
            if (connection == null) {
                //3.数据源中获取一个连接并且存入threadLocal中
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            //4.返回当前线程的连接
            return connection;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void removeConnection() {
        threadLocal.remove();
    }

}
