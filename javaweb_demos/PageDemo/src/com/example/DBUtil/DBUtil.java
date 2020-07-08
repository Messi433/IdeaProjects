package com.example.DBUtil;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
    //驱动名和数据库url
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost:3306/shopping";
    //数据库账号密码
    static final String USER="root";
    static final String PASSWORD="k753951";
    //静态代码块加载驱动
    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //返回数据库对象
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection=DriverManager.getConnection(DB_URL,USER,PASSWORD);
            if (connection!=null){
                System.out.println("数据库连接成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //关闭数据库
    public static void closeConnection(Connection connection){
        if (connection!=null){
            try {
                connection.close();
                connection=null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test(){
        //测试代码
        Connection connection=null;
        connection=DBUtil.getConnection();
        if (connection!=null)
            DBUtil.closeConnection(connection);

    }

}
