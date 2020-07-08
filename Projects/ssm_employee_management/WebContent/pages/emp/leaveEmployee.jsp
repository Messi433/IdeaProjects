<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


</style>
</head>
<body>
<div id="header">
<h2>离职信息填写</h2>
</div>
<form action="<%=path %>/employeeController/leave" method="post">
	<table id="tab" border="0" width="800" cellspacing="1" cellpadding="3">
		<!-- 隐藏数据 -->
		<input type="hidden" name="empno"  value="${emp.empno }"/>
		<input type="hidden" name="empname"   value="${emp.empname }"/>
		<input type="hidden" name="empsex"   value="${emp.empsex }"/>
		<input type="hidden" name="empphone"   value="${emp.empphone }"/>
		<input type="hidden" name="entrydate"   value="${emp.entrydate }"/>
		<input type="hidden" name="empaddr"   value="${emp.empaddr}"/>
		<input type="hidden" name="salary"  value="${emp.salary }"/>
		<input type="hidden" name="deptno"   value="${emp.deptno }"/>
		<tr>
			<td width="120">部门名称：</td>		
			<td width="120">员工姓名：</td>
			<td width="120">员工性别：</td>
			<td width="120">入职日期：</td>
			<td width="120">联系电话：</td>
			<td width="120">现住址：</td>
			<td width="120">薪资：</td>
		</tr>
		<tr>
			<td width="380">${emp.deptname}</td>
			<td width="380">${emp.empname }</td>
			<td width="380">${emp.empsex }</td>
			<td width="380">${emp.entrydate }</td>
			<td width="380">${emp.empphone }</td>
			<td width="380">${emp.empaddr }</td>
			<td width="380">${emp.salary }</td>
		</tr>
	</table>
	<textarea rows="3" cols="30" name="dimissionreason" id="dimissioinreason"></textarea>
	<input type="submit" name="button" id="button" value="确定"/>&nbsp;
	<input type="reset" name="button2" id="button2" value="取消"/>&nbsp;&nbsp;
	<a href="<%=path %>/employeeController/findAll">返回</a>
</form>

</body>
</html>