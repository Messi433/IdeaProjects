package sch.ck.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    //mysql驱动包名
     static final String driver = "com.mysql.jdbc.Driver";
    //数据库连接地址
     static final String URL = "jdbc:mysql://localhost:3306/shopping";
    //用户名
     static final String USER_NAME = "root";
    //密码
     static final String PASSWORD = "k753951";
    //Conn对象连接数据库
    static  Connection connection =null;
    static
    {
        try {
            Class.forName(driver);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //单例模式返回数据库连接对象
    public static Connection getConnection() throws SQLException {
        if (connection==null){
            //若为空，则说明connection对象为创建
            connection= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            return connection;
        }
        return  connection;
    }
    public static void main(String[] args){
        try{
            //连接数据库
            Connection conn = DBHelper.getConnection();
            if (conn!=null){
                System.out.println("数据库连接成功");
            }else{
                System.out.println("数据库连接异常");
            }
        }catch (Exception e){
            e.printStackTrace();

        }

    }


}