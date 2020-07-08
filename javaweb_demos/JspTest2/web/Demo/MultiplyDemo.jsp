<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/29
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<html>
<head>
    <title>输出九九乘法表</title>
</head>
<body>
    <h1>输出九九乘法表</h1><<br>
    <hr>
    <%!
       String s = "";
       String Multiply() {
          for (int i = 1; i <= 9; i++) {
              for (int j = 1; j <= i; j++) {
                  s += i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp";
              }
              s+="<br>";
          }
          return s;
       }
    %>
    <%=Multiply()
    %>

</body>
</html>
