<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.page-header{
width:500px;
text-align:center
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
<div class="page-header">
<h3>新增部门</h3>
</div>
<form action="<%=path %>/deptController/addDept" method="post">
<table id="tab" width="500">
<tr >
<td widtg="120">
部门名称  
</td>
<td>
<input type="text" name="deptname" id="deptname">
</td>
</tr>
<tr>
<td colspan="2" align="center">
<input type = "submit"  value="增加">
<input type = "reset"  value="取消">
<a href="<%=path %>/deptController/findAll">返回</a>
</td>
</tr>
</table>
<div id="msg">${msg}</div>
</form>
</body>
</html>