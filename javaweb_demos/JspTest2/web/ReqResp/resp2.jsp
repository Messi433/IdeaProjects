<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求重定向与请求转发的区别</title>
</head>
<body>
<%
    //请求重定向与请求转发的区别
    //请求重定向
     // response.sendRedirect("req.jsp");
    //请求转发
    request.getRequestDispatcher("req.jsp");
%>

</body>
</html>
