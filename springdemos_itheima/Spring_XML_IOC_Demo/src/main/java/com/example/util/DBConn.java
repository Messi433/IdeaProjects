package com.example.util;

import java.sql.*;

public class DBConn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String URL="jdbc:mysql://127.0.0.1:3306/javastudy?serverTimezone=GMT&useUnicode=true&characerEncoding=utf-8&useSSL=true";
        String USER="root";
        String PASSWORD="k753951";
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
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
