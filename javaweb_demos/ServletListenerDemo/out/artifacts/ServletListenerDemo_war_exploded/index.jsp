<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/4/8
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主界面</title>
  </head>
  <body>
    <h1>跳转界面</h1>
    <h3>
        <button onclick="location.href='<%=request.getContextPath()%>/init.jsp';">Init</button>
        <button onclick="location.href='<%=request.getContextPath()%>/remove.jsp';">Destory</button>

    </h3>
  </body>
</html>
