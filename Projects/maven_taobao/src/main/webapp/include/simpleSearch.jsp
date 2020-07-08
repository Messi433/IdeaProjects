<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<link rel="stylesheet" href="css/simple-search.css">
<div class="simple-search-warp">
	<div class="search-content">
		<div class="sea-hd">
			<div class="logo">
				<h1><a href="index.jsp"><img src="img/register-淘宝网logo1.png" alt=""></a></h1>
				<h2 class="tsl">商品分类</h2>
			</div>

		</div>
		<div class="search-box">
			<div class="search-bd">
				<div class="search-tab">
					<ul>
						<li class="select">宝贝</li>
						<li>天猫</li>
						<li>店铺</li>
					</ul>
				</div>
				<div class="search-panel">
					<a href="" class="search-ico"></a>
					<form action="foresearch" method="post">
						<div class="btn">
							<button type="submit">搜索</button>
						</div>
						<div class="search-inp-box">
							<div class="search-inp">
								<input type="text" id="" placeholder="程序编程" value="${param.keyword}" name="keyword"/>
							</div>
						</div>
					</form>
					<a href="#" class="camera"></a>
				</div>
			</div>

		</div>
	</div>
</div>
