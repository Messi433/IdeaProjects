<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.text.*" language="java" %>
<html>
<head>
    <title>获取属性，实现跳转</title>
</head>
<body>
    <h3>
        page<br>
        <%
            //pageContext.getSession().getAttribute("username");

            //pageContext.forward("/Demo/MultiplyDemo.jsp");
            pageContext.include("include.jsp");
        %>

    </h3>
</body>
</html>
