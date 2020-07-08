<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h1>application内置对象</h1>
    <hr>
    <h1>application属性值</h1>
    <%
        application.setAttribute("运动","足球");
        application.setAttribute("游戏","吃鸡");
        application.setAttribute("电影","很多");
        application.setAttribute("工作","编程");
    %>
    <h1>
        <%
            Enumeration attribute = application.getAttributeNames();
            while(attribute.hasMoreElements()){

                out.println(attribute.nextElement());
            }
        %>
    </h1>
</body>
</html>
