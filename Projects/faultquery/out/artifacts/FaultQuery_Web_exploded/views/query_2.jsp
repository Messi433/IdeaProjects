<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>Insert title here</title>
<link rel="stylesheet" href="css/query.css" />
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/zishiying.js"></script>
</head>
<body>
	
	<c:if test="${!empty newQuestion }">
		<script type="text/javascript">
			alert("点击成功！");
		</script>
	</c:if>

	<c:if test="${!empty question && empty newQuestion }">
		<div id="title">
			<form action="reBack.do" method="post">
				<input type="hidden" value="${question.id }">
				<input id="reBack" type="submit" value="返回">
			</form>
			<span>数控机床</span>
		</div>
		<h1>${question.title }</h1>
		<div id="">
			<div id="img"></div>
			<div id="source">
				<span id="website">${question.name }</span><br /> <span
					id="time">${question.time }</span>
			</div>
			<div id="solving">
				<form action="add.do" method="post">
					<input type="hidden" name="id" value="${question.id }">
					<input type="submit" value="解决 +1" />
				</form>
			</div>
			<div id="answer">
				<span>
					${question.content }
				</span>
			</div>
		</div>
	</c:if>
	<c:if test="${!empty newQuestion }">
		<div id="title">
			<form action="reBack.do" method="post">
				<input type="hidden" value="${newQuestion.id }">
				<input id="reBack" type="submit" value="返回">
			</form>
			<span>数控机床</span>
		</div>
		<h1>${newQuestion.title }</h1>
		<div>
			<div id="img"></div>
			<div id="source">
				<span id="website">${newQuestion.name }</span><br /> 
				<span id="time">${newQuestion.time }</span>
			</div>
			<div id="solving">
				<form action="add.do" method="post">
					<input type="hidden" name="id" value="${newQuestion.id }">
					<input type="submit" value="解决 +1" />
				</form>
			</div>
			<div id="answer">
				<span>
					${newQuestion.content }
				</span>
			</div>
		</div>
	</c:if>
</body>
</html>