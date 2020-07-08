<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<body>
    <h3>欢迎
        <%
            String user = "";
            if (session.getAttribute("user")!=null)
            {
                user = session.getAttribute("user").toString();
            }
        %>
        <%=session.getAttribute("user")

        %>
        登录成功</h3>
</body>
</html>
