package sch.ck.Dao;

import sch.ck.DBHelper.DBHelper;
import sch.ck.Information.PlayerInformation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerDao {

    //获得所有商品信息
    public ArrayList<PlayerInformation> getAllInfo() throws SQLException {

        PreparedStatement stmt =null;
        ResultSet rs=null;
        Connection conn=null;
        try{

            conn = DBHelper.getConnection();
            String sql = "select * from player";
            stmt=conn.prepareStatement(sql);
            rs=stmt.executeQuery();
            ArrayList<PlayerInformation> list = new ArrayList<PlayerInformation>();
            while (rs.next()){
                PlayerInformation pInfo =  new PlayerInformation();
                pInfo.setId(rs.getInt("id"));
                pInfo.setName(rs.getString("name"));
                pInfo.setCity(rs.getString("city"));
                pInfo.setCount(rs.getInt("count"));
                pInfo.setPrice(rs.getInt("price"));
                ;
                list.add(pInfo);


            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //由上到下释放
            if(rs!=null){
                rs.close();
                //rs置为空
                rs=null;
            }
            if(stmt!=null){
                stmt.close();
                //stmt置为空
                stmt=null;
            }if (conn==null){
                System.out.println("空指针异常");
            }else {
                System.out.println("没事");
            }



        }
    }

    /*public  static void main(String[] args) throws SQLException {
       PlayerDao d = new PlayerDao();
       d.getAllInfo();
    }*/
}
