<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.StringTokenizer" %><%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include方法</title>
</head>
<body>
    <h1>include方法</h1>
    <br>
    <%

        Date date  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月DD日");
        String d = sdf.format(date);
        out.println(date);

    %>
</body>
</html>
