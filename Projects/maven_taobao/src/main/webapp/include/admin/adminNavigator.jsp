<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<div class="navitagorDiv">
	<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
		<img style="margin-left:10px;margin-right:0px" class="pull-left" src="/img/site/tmallbuy.png" height="45px">
		<a class="navbar-brand" href="#nowhere">淘宝后台</a>
		<a class="navbar-brand" href="admin_category_list">分类管理</a>
		<a class="navbar-brand" href="admin_user_list">用户管理</a>
		<a class="navbar-brand" href="admin_order_list">订单管理</a>
		<style>
			.navbar-brand-login{
				position: absolute;
				right: 40px;
			}
            .navbar-brand-login2{
                position: absolute;
                right: 0px;
            }
		</style>

		<c:if test="${empty administer}">
            <a class="navbar-brand navbar-brand-login" href="#">请登录</a>
        </c:if>
        <c:if test="${!empty administer}">
            <a class="navbar-brand navbar-brand-login" href="#">${administer.name}</a>
            <a class="navbar-brand navbar-brand-login2" href="admin/backLogin.jsp">退出</a>
        </c:if>
	</nav>
</div>