<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<link rel="stylesheet" href="css/search.css">
<div class="search-warp">
	<div class="search-content">
		<div class="logo-box">
			<a href="index.jsp"><img src="img/taobaologo.jpg" alt=""/></a>
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
								<input type="text" id="" placeholder="程序编程" name="keyword" value="${param.keyword}"/>
							</div>
						</div>
					</form>
					<a href="#" class="camera"></a>
				</div>
			</div>
			<div class="search-ft">
				<ul>
					<c:forEach items="${cs}" var="c" varStatus="st">
						<c:if test="${st.count>=5 and st.count<=8}">
						<li>
							<a href="forecategory?cid=${c.id}">
									${c.name}
							</a>
							<c:if test="${st.count!=8}">
								<span>|</span>
							</c:if>
						</li>
						</c:if>
					</c:forEach>
				</ul>
				<a href="category-nav.html" class="more">更多></a>
			</div>
		</div>
	</div>
</div>
