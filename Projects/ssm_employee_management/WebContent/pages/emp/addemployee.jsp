<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/My97DatePicker/WdatePicker.js"></script>
<style type="text/css">
    #header{
		text-align:center;
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
<h2>增加员工</h2>
</div>
<form action="<%=path %>/employeeController/addEmployee" method="post">
<table id="tab" cellpadding="1" cellspacing="1" border="0"  align="center">
<tr>
<td width="110">部门名称：</td>
<td width="380">
<select name="deptno">
<c:forEach items="${deptlist}" var="l" >
<option value="${l.deptno }">${l.deptname }</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td width="110">员工姓名:</td>
<td width="380"><input type="text" name="empname"/></td>
</tr>
<tr>
<td width="110">员工性别:</td>
<td width="380">
<input type="radio" value="男" name="empsex" checked="checked"/>男
<input type="radio" value="女" name="empsex" />女
</td>
</tr>
<tr>
<td width="110">入职日期:</td>
<td width="380"><input type="text" name="entrydate" id="entrydate" class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'true'})"/></td>
</tr>         
<tr>
<td width="110">联系电话:</td>
<td width="380"><input type="text" name="empphone"/></td>
</tr>
<tr>
<td width="110">入住地址:</td>
<td width="380"><input type="text" name="empaddr"/></td>
</tr>
<tr>
<td width="110">薪资:</td>
<td width="380"><input type="text" name="salary"/></td>
</tr>
<tr>
				<td colspan="2" align="center"><input type="submit" name="button" id="button" value="增加"/>
				&nbsp;<input type="reset" name="button2" id="button2" value="取消"/>
		        &nbsp;&nbsp;<a href="<%=path %>/employeeController/findAll">返回</a>
				</td>
			</tr>
</table>
</form>
<div id="msg">${msg}</div>
</body>
</html>