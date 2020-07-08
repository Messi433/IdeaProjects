<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*,java.io.*" language="java" %>
<html>
<head>
    <title>resp实例</title>
</head>
<body>
    <h1>response对象实例</h1>
    <%
        //比较内置对象out 与 输出流对象outer 输出的先后顺序，outer先于out
        response.setContentType("text/html;charset=utf-8");
        out.println("out内置对象所输出"+"/n");
        //加一个flush();强制清除缓冲区的内容，并把缓冲区内的内容输出到浏览器中
        out.flush();
        PrintWriter outer = response.getWriter();
        outer.println("outer对象所输出");


    %>
</body>
</html>
