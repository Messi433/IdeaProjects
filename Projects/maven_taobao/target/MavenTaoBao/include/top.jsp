<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/comment.css">
<div class="top-nav-warp">
	<div class="top-nav">
		<ul class="top-nav-left">
			<!--li共同类名-->
			<li class="top-nav-menu china">
				<div class="china-span">
					中国大陆
					<span class="bgPic triangle_ico"></span>
				</div>
				<!--
                    下拉列表
                -->
				<div class="menu-place">
					<ul>
						<li>全球</li>
						<li>中国大陆</li>
						<li>美国</li>
						<li>日本</li>
						<li>新加坡</li>
						<li>台湾</li>
						<li>香港</li>
						<li>澳门</li>
						<li>东南亚</li>
						<li>南美</li>
						<li>欧洲</li>
						<li>澳大利亚</li>
					</ul>
				</div>
			</li>
			<li class="site-nav-menu loginli">
				<c:if test="${!empty user}">
					<a href="forebought">${user.name}</a>
					<a href="forelogout">退出</a>
				</c:if>
				<c:if test="${empty user}">
					<a href="login.jsp" class="login">亲，请登录</a>
					<a href="register.jsp" class="register">免费注册</a>
				</c:if>
			</li>
			<li>
				<a href="#">手机逛淘宝</a>
			</li>
			<li></li>
			<li></li>
		</ul>
		<ul class="top-nav-right">
			<li class="top-nav-menu mytaobao">
				<div class="mytaobao_div">
					<a href="#">
						<span class="">我的淘宝</span>
						<span class="bgPic triangle_ico"></span>
					</a>
				</div>
				<div class="menu-mytaobao">
					<ul>
						<li><a href="forebought">已买到的宝贝</a></li>
						<li><a href="">我的足迹</a></li>
					</ul>
				</div>

			</li>
			<li class="top-nav-menu shoppingCar">
				<a href="forecart">
					<span class="bgPic shoppingCar_Pic"></span>
					<span class="shoppingCar_content">购物车</span>
				</a>

			</li>
			<li class="top-nav-menu likeFolder">
				<div class="likefolderdiv">
					<a href="#">
						<span class="bgPic likeFolder_Pic"></span>
						<span class="likeFolder_content">收藏夹</span>
						<span class="bgPic triangle_ico"></span>
					</a>
				</div>
				<div class="menu-likefolder">
					<ul>
						<li>收藏的宝贝</li>
						<li>收藏的店铺</li>
					</ul>
				</div>
			</li>
			<li class="top-nav-menu goodsCategory">
				<a href="forecategoryNav"><span class="goodsCategory_content">商品分类</span></a>
			</li>
			<li class="top-nav-menu cutline">
				<a href="#"><span class="cutline_content">|</span>
				</a>
			</li>
			<li class="top-nav-menu sellerCenter">
				<a href="#">
					<span class="sellerCenter_content">卖家中心</span>
					<span class="bgPic triangle_ico"></span>
				</a>

			</li>
			<li class="top-nav-menu connectService">
				<a href="#">
					<span class="connectService_content">联系客服</span>
					<span class="bgPic triangle_ico"></span>
				</a>
			</li>
			<li class="top-nav-menu webNav">
				<a href="#">
					<span class="bgPic webNavMenu_Pic"></span>
					<span class="webNav_content">网站导航</span>
					<span class="bgPic triangle_ico"></span>

				</a>
			</li>
		</ul>
	</div>

</div>


