<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>员工变更</h2>
</div>

<form action="<%=path %>/employeeController/updateEmployee" method="post">
<table id="tab" cellpadding="1" cellspacing="1" border="0"  align="center">
<input type="hidden" value="${emp.empno }" name="empno" />
<tr>
<td width="110">部门名称：</td>
<td width="380">
<select name="deptno">
<c:forEach items="${deptlist}" var="l" >
<option value="${l.deptno }" <c:if test="${l.deptno eq emp.deptno }" >selected="selected"</c:if>>${l.deptname }</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td width="110">员工姓名:</td>
<td width="380"><input type="text" name="empname" value="${emp.empname }" readonly="readonly"/></td>
</tr>

<tr>
<td width="110">员工性别:</td>
<td width="380">
<input type="radio" value="${emp.empsex }" name="empsex" readonly="readonly"/>

</td>
</tr>
<tr>
<td width="110">入职日期:</td>
<td width="380"><input type="text" name="entrydate" id="entrydate" readonly="readonly" value="${emp.entrydate }"/></td>
</tr>         
<tr>
<td width="110">联系电话:</td>
<td width="380"><input type="text" name="empphone" value="${emp.empphone }"/></td>
</tr>
<tr>
<td width="110">入住地址:</td>
<td width="380"><input type="text" name="empaddr" value="${emp.empaddr }"/></td>
</tr>
<tr>
<td width="110">薪资:</td>
<td width="380"><input type="text" name="salary" value="${emp.salary }"/></td>
</tr>
<tr>
<td width="110">变更原因:</td>
<td width="380">
<textarea rows="3" cols="30" name="changereason"></textarea>
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type = "submit"  value="修改">
<input type = "reset"  value="取消">
<a href="EmployeeServlet?method=FindAll">返回</a>
</td>
</tr>
</table>
</form>
</body>
</html>