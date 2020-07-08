<%--
  Created by IntelliJ IDEA.
  User: messi433
  Date: 2020/2/1
  Time: 2:23 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
    <%--@ModelAttribute示例--%>
    <form method="post" action="/anno/testModelAttribute">
        用户名：<input type="text" name="username"><br>
        年龄：<input type="password" name="age"><br>
        <input type="submit" value="提交">
    </form><br>
    <%--@sessionAttribute示例--%>
    <a href="/anno/testSetAttribute">设置Attribute</a>
    <a href="/anno/testGetAttribute">获取SessionAttribute</a>
    <a href="/anno/testDelSession">销毁Session</a>
    <a href="/webservice/test">json</a>
</body>
</html>
