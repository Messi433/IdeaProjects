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
    <title>用户注册</title>
</head>
<body>
    <form action="resp2.jsp" method="post" name="reg">
        <table>
            <tr>
                <td>用户名
                <input type="text" name="username" >



                </td>

            </tr>
            <tr>
                <td>
                    爱好
                    <input type="checkbox" name="favorite" value="music">音乐
                    <input type="checkbox" name="favorite" value="sport">运动
                    <input type="checkbox" name="favorite" value="party">派对

                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>
            </tr>
        </table>
        <br>
        <a href="req.jsp?username=哈喽">url传参</a>

    </form>
</body>
</html>
