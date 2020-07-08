<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>格式化日期时间</title>
</head>
<body>
    <%
        Date date = new Date(session.getCreationTime());//创建日期对象,传入session创建时间参数
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年mm月dd日 HH:MM");//格式化日期形式
        session.setMaxInactiveInterval(60);//设置session存活60s
        //或者用销毁方法
        //session.invalidate();
    %>
    <h1>session创建日期</h1>
    <%=sdf.format(date)
            //传入格式化对象参数
    %>
</body>
</html>
