<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/3/31
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输出用户信息</title>
</head>

<body>
    <h1>request内置对象</h1>
    <%
        request.setCharacterEncoding("utf-8");
    %>
    用户名：
    <h1>

        <%=request.getParameter("username")

        %>
    </h1>
    <hr>
    <h1>
        爱好：
        <%
            if (request.getParameter("favorite")!=null){
                String[] favorotes = request.getParameterValues("favorite");
                for (int i=0;i<favorotes.length;i++
                        ) {
                    out.println("favorite"+"&nbsp;&nbsp;&nbsp;"+i+"&nbsp;&nbsp;&nbsp;"+favorotes[i]);
                }
            }
        %>

    </h1>

</body>
</html>
