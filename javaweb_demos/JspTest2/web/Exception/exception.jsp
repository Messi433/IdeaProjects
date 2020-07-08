<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>异常处理测试</title>
</head>
<body>
    <h3>
        获得异常的消息：<%= exception.getMessage()

    %><<br>
        输出异常的字符串<%= exception.toString()

        %>
    </h3>
</body>
</html>
