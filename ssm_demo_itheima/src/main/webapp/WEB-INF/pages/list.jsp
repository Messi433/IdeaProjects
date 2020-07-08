<%--
  Created by IntelliJ IDEA.
  User: messi433
  Date: 2020/2/9
  Time: 9:35 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <h3>用户列表</h3>
    <table>
        <c:forEach items="${accounts}" var="account">
            用户姓名<tr>${account.name}</tr>
        </c:forEach>
    </table>
</body>
</html>
