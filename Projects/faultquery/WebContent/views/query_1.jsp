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
<link rel="stylesheet" href="../css/find.css">
<script type="text/javascript" src="../js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="../js/zishiying.js"></script>
<script type="text/javascript" src="../js/zishiying.js"></script>
<script type="text/javascript" src="../js/back.js" ></script>
</head>
<body>

	<div>
		<div class="find_top_div">
			<input type="text" class="find_input" name="find_input"
				value="${type} ; ${description}"> <a href="../index.html"
				class="reset_button">取消</a>
		</div>
		<hr>

		<div class="find_main_div">
			<c:if test="${!empty sessionScope.questions }">
				<c:forEach items="${ sessionScope.questions}" var="question">
					<a href="../faultquery.servlet?method=answer&id=${question.id }">
						<div class="result">
							<font style="color: red;"><h1>${question.title }</h1></font> <font
								style="color: darkgray;"><span>${question.content }</span></font><br>
						</div>
					</a>
				</c:forEach>
				<div class="back_top" id="back_top"></div>
			</c:if>
			<c:if test="${empty sessionScope.questions }">
				<jsp:include page="errorSearch.html"></jsp:include>
			</c:if>
		</div>

	</div>
	<script src="../js/find.js"></script>

</body>
</html>