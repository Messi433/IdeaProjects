<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
	#zengjia{
		margin:0 auto;
		width:850px;
		text-align:right;
	}

</style>
</head>
<body>
<div id="header">
<h2>部门人员信息列表</h2>
</div>
<div id="zengjia"><a href="<%=path %>/employeeController/getDeptname">新增员工</a></div>
<div class="conter">
<table id="tab" cellpadding="1" cellspacing="1" border="0" width="600px" align="center">
<tr style="background-color:#ffffff;">
			<td>员工编号</td>
			<td>部门名称</td>
			<td>员工姓名</td>
			<td>员工性别</td>
			<td>入职日期</td>
			<td>联系电话</td>
			<td>员工住址</td>
			<td>薪资</td>
			<td>离职日期</td>
			<td>操作</td>
		</tr>

<c:forEach items="${list}" var = "l">
		<tr>
			<td>${l.empno }</td>
			<td>${l.deptname }</td>
			<td>${l.empname }</td>
			<td>${l.empsex }</td>
			<td>${l.entrydate }</td>
			<td>${l.empphone }</td>
			<td>${l.empaddr }</td>
			<td>${l.salary }</td>
			<td>${l.leavedate }</td>
			<td>
		<c:if test="${!empty(l.leavedate)}"><a href="<%=path %>/employeeController/awary?empno=${l.empno}">减员</a></c:if>
		<c:if test="${empty(l.leavedate) }">	<a href="<%=path %>/employeeController/getEmployee?empno=${l.empno }">变更</a>
			<a href="<%=path %>/employeeController/leaveEmployee?empno=${l.empno}">离职</a></c:if>
			</td>
		</tr>
		</c:forEach>
	<tr>
		<td colspan="10" align="center">
			<a href="<%=path %>/deptController/findAll">返回</a>
		</td>
	</tr>
	<tr>
	<td><font color="red" size="5">${msg}</font></td>
	</tr>
	</table>
	
<!--     <c:if test="${param.page != 1}">  
	<a href="EmployeeServlet?method=FindAll&page=1">首页</a>
	</c:if>
	<c:if test="${param.page > 1}">
	<a href="EmployeeServlet?method=FindAll&page=${param.page -1}">上一页</a>
	</c:if>
	
	<font size="4">
	<c:forEach begin="1" end="${Line}" varStatus="getcount">
	<a href="EmployeeServlet?method=FindAll&page=${getcount.index}">${getcount.index}</a>
	</c:forEach>
	</font>
	<c:if test="${param.page < 3 }">
	<a href="EmployeeServlet?method=FindAll&page=${param.page +1}">下一页</a>
	</c:if>
	  <c:if test="${param.page != 3}">  
	<a href="EmployeeServlet?method=FindAll&page=${Line}">尾页</a>
	</c:if>
<div id="msg">${msg}</div>
<form action="EmployeeServlet?method=FindAll" method="post">
<select name = "page" id="page">
<c:forEach begin="1" end="${Line}" varStatus="getcount">
	<option>${getcount.index}</option>
	</c:forEach>
</select>
<input type="submit" value="跳转"/>
</form>
-->
</div>

</body>
</html>