package com.example.util;

import java.sql.*;

public class DBConn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL="jdbc:mysql://localhost:3306/javastudy?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
        String USER="root";
        String PASSWORD="k1234567";
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获得数据库链接
        Connection conn= DriverManager.getConnection(URL, USER, PASSWORD);
        //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from mobile");
        //4.处理数据库的返回结果(使用ResultSet类)
        while(rs.next()) {
            System.out.println(rs.getString("name")+" "+rs.getString("type"));
        }
        //关闭资源
        rs.close();
        st.close();
        conn.close();


    }

}
