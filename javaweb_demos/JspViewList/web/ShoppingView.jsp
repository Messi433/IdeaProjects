<%--
  Created by IntelliJ IDEA.
  User: ckzh1
  Date: 2018/4/2
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="sch.ck.Dao.PlayerDao,sch.ck.Information.PlayerInformation" %>
<%@ page import="java.util.ArrayList" %>


<html>
<head>
    <title>商品显示</title>
</head>
<body>
    <h1>商品区</h1>
    <hr>
    <h3>
        <%

            PlayerDao dao = new PlayerDao();

            ArrayList<PlayerInformation> list =dao.getAllInfo();//PlayDao方法的list返回给新建的list

            if (list!=null&&list.size()>0){
                for (int i=0;i<list.size();i++){

                    PlayerInformation pinfo=list.get(i);

        %>

        <!--商品循环开始 -->
        球员：<%=pinfo.getName()%>
        城市：<%=pinfo.getCity()%>
        身价：<%=pinfo.getPrice()%>
        <%
                }
            }
        %>
    </h3>
</body>
</html>
