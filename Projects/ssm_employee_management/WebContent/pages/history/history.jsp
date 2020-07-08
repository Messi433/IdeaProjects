<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <% String path = request.getContentType(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
    #header{
		text-align:center;
	}
	
	#tab{
		background-color:#AAAAAA;
		width:930px;
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
<h2>员工变更记录</h2>
</div>
<form action="findAll" method="post">
<input type="text" name ="key" >&nbsp;&nbsp;<input type="submit" value = "查询事务">
<div><%=path %></div>
</form>
	<table id="tab" border="0" width="800" cellspacing="1" cellpadding="3">
		<tr>
			<th width="120">员工编号：</td>
			<th width="120">员工姓名：</td>
			<th width="120">部门名称：</td>
			<th width="120">修改日期：</td>
			<th width="120">修改原因：</td>
			<th width="120">离职时间：</td>
			<th width="120">离职原因：</td>
			<th width="120">薪资：</td>
		</tr>
		<c:forEach items="${history}" var="h">
		<tr>
			<td width="380">${h.empno}</td>
			<td width="380">${h.empname }</td>
			<td width="380">${h.deptname }</td>
			<td width="380">${h.changedate}</td>
			<td width="380">${h.changereason }</td>
			<td width="380">${h.dimissiondate }</td>
			<td width="380">${h.dimissionreason }</td>
			<td width="380">${h.salary}</td>
		</tr>
		</c:forEach>
	</table>
	<!--  
	<c:if test="${param.page != 1}">  
	<a href="HistoryServlet?method=Gethistory&page=1">首页</a>
	</c:if>
	<c:if test="${param.page > 1}">
	<a href="HistoryServlet?method=Gethistory&page=${param.page -1}">上一页</a>
	</c:if>
	
	<font size="4">
	<c:forEach begin="1" end="${Line}" varStatus="getcount">
	<a href="HistoryServlet?method=Gethistory&page=${getcount.index}">${getcount.index}</a>
	</c:forEach>
	</font>
	<c:if test="${param.page < 3 }">
	<a href="HistoryServlet?method=Gethistory&page=${param.page +1}">下一页</a>
	</c:if>
	  <c:if test="${param.page != 3}">  
	<a href="HistoryServlet?method=Gethistory&page=${Line}">尾页</a>
	</c:if>
<div id="msg">${msg}</div>
<form action="HistoryServlet?method=Gethistory" method="post">
<select name = "page" id="page">
<c:forEach begin="1" end="${Line}" varStatus="getcount">
	<option>${getcount.index}</option>
	</c:forEach>
</select>
<input type="submit" value="跳转"/>
</form>
-->
</body>
</html>