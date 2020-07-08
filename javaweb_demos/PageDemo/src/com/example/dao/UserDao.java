package com.example.dao;

import com.example.DBUtil.DBUtil;
import com.example.bean.User;
import org.junit.jupiter.api.Test;

import java.net.UnknownServiceException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    User user=null;
    ArrayList <User> list = new ArrayList<User>();
    int rowCount;

    public ArrayList<User> findAllUser() throws SQLException {
        String sql="select * from test";
        //user=new User();//不能把User new在这
        /*
        * 我们new了一个User对象，就只是new了一个唯一的ID，我们将对象放入list时，list就只是添加了一个对象的引用而已，而我们只是简单的
        * set对象进行对对象的值的改变，但是其ID还是唯一的，list又只是对于对象唯一ID的引用。所以结果就显而易见的。
           要改正这个代码，只需在循环中不断new一个User对象就可以了，使其ID不唯一。
            以下代码均测试无误
            /*System.out.println(rowCount+"   "+rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)
            +"   "+rs.getInt(4)+"   "+rs.getInt(5));*/
            /*System.out.println(user.getId()+"  "+user.getName()+"  "+user.getSex()+"  "+
            user.getAge()+"  "+user.getPhoneNumber());
         */


        conn=DBUtil.getConnection();
        ps=conn.prepareStatement(sql);
        rs=ps.executeQuery();

        while(rs.next()){

            user = new User();
            this.rowCount++;
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setSex(rs.getString("sex"));
            user.setAge(rs.getInt("age"));
            user.setPhoneNumber(rs.getInt("phonenumber"));

            list.add(user);
            //user.setUserList(list);

        }
        return list;
    }


}
