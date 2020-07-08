package sch.taobao.dao;

import org.junit.Test;
import sch.taobao.bean.Administer;
import sch.taobao.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdministerDAO {

    Connection connection=null;
    PreparedStatement preparedStatement=null;
    Statement statement = null;
    ResultSet resultSet=null;
    //CURD
    public void add(Administer administer){

       try{
            String sql = "insert into administer value(null ,?,?)";
            connection=DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,administer.getName());
            preparedStatement.setString(2,administer.getName());
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void delete(int id){
        String sql = "delete from administer where id="+id;
        try {
            connection=DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public void update(Administer administer){

        String sql = "update administer set name= ? , password = ? where id = ? ";
        try{
            connection=DBUtil.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,administer.getName());
            preparedStatement.setString(2,administer.getName());
            preparedStatement.setInt(3,administer.getId());
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Administer get(int id){
        Administer administer=new Administer();
        String sql = "select * from administer where id="+id;
        try{
            connection=DBUtil.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                administer.setId(resultSet.getInt(1));
                administer.setName(resultSet.getString(2));
                administer.setPassword(resultSet.getString(3));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return administer;
    }
    public Administer get(String name,String password){
        Administer administer=null;
        String sql = "select * from administer where name=? and password=?";
        try{
            connection=DBUtil.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                administer=new Administer();
                int id=resultSet.getInt(1);
                administer.setName(resultSet.getString(2));
                administer.setPassword(resultSet.getString(3));
                administer.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return administer;
    }

    public void print(Administer administer){
        System.out.println(administer.getId()+"  "+administer.getName()+"  "+administer.getPassword());
    }
    @Test
    public void test(){
        Administer administer;
        administer = this.get("admin","admin");
        print(administer);
    }
}
