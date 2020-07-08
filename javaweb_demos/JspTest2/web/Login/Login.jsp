<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="exceptionLogin.jsp" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
    <form action="doLogin.jsp" method="post" name="Login">
        用户名：<input type="text" name="username"><<br>
        密码：<input type="password" name="userpw"><br>
        <input type="submit" name="submit" value="登录">

    </form>
</body>
</html>
