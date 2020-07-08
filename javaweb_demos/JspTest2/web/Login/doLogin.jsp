<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    String username =  request.getParameter("username");
    String password = request.getParameter("userpw");
    if ("admin".equals(username)&&"123".equals(password)){
        session.setAttribute("user",username);
        request.getRequestDispatcher("/Login/Login_Sucess.jsp").forward(request,response);

    }else{
        //登录失败重定向
        response.sendRedirect("/Login/Login_Fail.jsp");

    }
%>
