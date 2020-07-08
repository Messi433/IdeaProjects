package com.example.servlet;

import com.example.bean.PageBean;
import com.example.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/pageServlet")
public class pageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //jsp获得当前页数
        int pageNum = Integer.valueOf(req.getParameter("pageNum"));
        //设置显示的记录数;
        int pageSize = 4;
        //调用service方法进行处理
        Service service = new Service();

        try {
            PageBean pageBean=service.findAllUserWithPage(pageNum,pageSize);
            //将pb放入request域中
            req.setAttribute("pageBean",pageBean);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
