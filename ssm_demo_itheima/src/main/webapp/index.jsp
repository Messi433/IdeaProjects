<%--
  Created by IntelliJ IDEA.
  User: messi433
  Date: 2020/2/9
  Time: 9:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="/account/findAll">test_AccountController</a>

    <form method="post" action="/account/save">
        姓名:<input  type="text" name="name">
        金钱:<input  type="text" name="money">
        <input type="submit" value="保存">
    </form>
</body>
</html>
