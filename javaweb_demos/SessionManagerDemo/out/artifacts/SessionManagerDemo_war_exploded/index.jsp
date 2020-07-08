<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/4/9
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="sch.ck.entity.User" language="java" %>
<%@ page import="java.util.ArrayList" %>

<html>
  <head>
    <title>当前用户人数</title>
  </head>
  <body>
    <h1>当前用户人数</h1>
    <h3>
      <%
        ArrayList<User> userlist = (ArrayList<User>) request.getSession().getServletContext().getAttribute("userlist");
        if (userlist!=null){
          for (int i = 0;i<userlist.size();i++){

      %>
      SessionId=<%=userlist.get(i).getSessionId()%><br>
      IP=<%=userlist.get(i).getIP()%><br>
      FirstTime=<%=userlist.get(i).getFirstTime()%><br>
      <%
          }
        }
      %>
    </h3>
  </body>
</html>
