package com.example.dao;

import com.example.DBUtil.DBUtil;
import com.example.bean.PageBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PageDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    PageBean pageBean = null;

    public void query() throws SQLException {
        String sql = "select * from test";
        conn = DBUtil.getConnection();
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        int rowCount = 0;
        while (rs.next()) {
            rowCount = rs.getRow();
            pageBean.setTotalRecord(rowCount);

        }
        if (conn != null) {
            conn.close();

        }
    }
}
