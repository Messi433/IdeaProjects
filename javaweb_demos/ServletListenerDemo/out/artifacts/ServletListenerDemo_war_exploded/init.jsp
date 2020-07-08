<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/4/8
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>初始化界面</title>
</head>
<body>
    <h1>初始化参数</h1>
    <h3>
        <%
           /* request.setAttribute("RequestName","RequestValue");
            request.getSession().setAttribute("SessionName","SessionValue");
            request.getSession().getServletContext().setAttribute("ContextName","ContextValue");
            //监听器监听到添加操作
            out.println(request.getAttribute("RequestName"));
            out.println(session.getAttribute("SessionName"));
            out.println(session.getServletContext().getAttribute("ContextName"));*/
            //----------------错误代码-----------------------
            //request.getParameter("username");
            //session.setAttribute("sks","gname");
            //session.getAttribute("gname");
            //session.getServletContext().getAttribute("gname");

            //-----------------HttpSessionBindingListener--------------------
            //request.getSession().setAttribute("currentUser",new sch.ck.entity.User());


        %>
    </h3>
</body>
</html>
