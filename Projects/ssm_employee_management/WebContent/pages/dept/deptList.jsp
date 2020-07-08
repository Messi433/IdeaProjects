<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
    #header{
		text-align:center;
	}
	#zengjia{
		margin:0 auto;
		width:660px;
		text-align:right;
	}
	
	#tab{
		background-color:#AAAAAA;
	}
	td{
		background-color:#ffffff;
	}
	#msg{
	margin:0 auto;
	text-align:center;
	color:red;
	}

</style>
</head>
<body>
<div id="header">
<h2>部门列表</h2>
</div>
<div id="zengjia"><a href="../pages/dept/addDept.jsp">新增部门</a></div>

<div class="conter">
<table id="tab" cellpadding="1" cellspacing="1" border="0" width="600px" align="center">
<tr sty1e="background-color:#ffffff;">
<th>部门编号</th> <th>部门名称</th> <th>操作</th>
</tr>
<c:forEach items="${list}" var="l">
		<tr>
		<td>${l.deptno}</td>
		<td><a href="<%=path %>/deptController/getDeptno=${l.deptno}">${l.deptname}</a></td>
		<td>
		<a href="<%=path %>/deptController/findDept?deptno=${l.deptno}">修改</a>&nbsp;&nbsp;
		<a href="<%=path %>/deptController/delDept?deptno=${l.deptno}">删除</a>
		</td>
		</tr>
		</c:forEach>
</table>
<h4>
<div id="msg">${msg}</div>
</h4>
</div>

</body>
</html>