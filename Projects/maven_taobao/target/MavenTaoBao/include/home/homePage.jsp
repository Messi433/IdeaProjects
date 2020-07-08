

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


	<div class="screen-nav-warp">
		<div class="screen-nav-content"><!--导航栏固定显示区 -->
			<h3 class="mainMarket">主题市场</h3>
			<ul>
				<li><a href="#">天猫</a></li>
				<li><a href="#">聚划算</a></li>
				<li><a href="#">天猫超市</a></li>
			</ul>
			<ul>
				<li><a href="#">|</a></li>
				<li><a href="#">淘抢购</a></li>
				<li><a href="#">电器城</a></li>
				<li><a href="#">司法拍卖</a></li>
				<li><a href="#">中国质造</a></li>
				<li><a href="#">兴农扶贫</a></li>
			</ul>
			<ul>
				<li><a href="#">|</a></li>
				<li><a href="#">飞猪旅行</a></li>
				<li><a href="#">智能生活</a></li>
				<li><a href="#">苏宁易购</a></li>
			</ul>
		</div>
	</div>
	<div class="screen-box-warp">
		<div class="screen-box-main">
			<div class="screen-box-main_top">
				<div class="screen-box-main_top-left">
					<ul>
						<c:forEach items="${cs}" var="c">
							<li cid="${c.id}">
								<a href="forecategory?cid=${c.id}">${c.name}</a>
							</li>
						</c:forEach>

					</ul>
				</div>
				<div class="screen-box-main_top-right">
					<div class="right-top">
						<div class="right-top-l">
							<div class="pic_box">
								<!--轮播图 -->
								<a href="#"><img src="img/index-520.jpg"/></a>
								<ul class="pic_box-list">
									<li><a href="#"></a></li>
									<li><a href="#" class="select"></a></li>
									<li><a href="#"></a></li>
									<li><a href="#"></a></li>
									<li><a href="#"></a></li>

								</ul>
							</div>
						</div>
						<div class="right-top-r">
							<a href="#"><img src="img/index-淘妙师.png"/></a>
						</div>
					</div>
					<div class="right-bottom">
						<div class="right-bottom-l">
							<div class="head">
								<span class="tm-pic"></span>
								<span class="tm-content">理想生活上天猫</span>
							</div>
							<div class="b-l-bottom">
								<a href="#"><img src="img/jiangzhong.jpg" class="pic-jiangzhong"></a>
								<a href="#"><img src="img/olay.jpg" class="pic-olay"></a>
							</div>
						</div>
						<div class="right-bottom-r">
							<h5>今日热卖</h5>
							<div class="pic-t_shirt">
								<a href="#"><img src="img/pic_box3-r_txu.jpg"/></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="screen-box-main_bottom">
				<div class="main_bottom-1">
					<div class="toutiao-box">
						<img src=""/>
					</div>
					<p>让你的生活更有趣</p>
				</div>
				<div class="main_bottom-2">
					<div class="mi-box">
						<a href="#"><img src="img/hongmi.jpg.jpg"/></a>
					</div>
					<div class="mi-box-content">
						<h4><a href="#">米家蓝牙温湿度计体验：智能家居枢纽</a></h4>
						<p>
							IT之家12月21日消息?在11月28日小米举行的首届小米IoT开发者大会（MIDC）上，
							米家带来了一款蓝牙温湿度计产品，售价69元。IT之家编辑部已经收到了这款新产品，
							接下来小编为大家带来开箱图赏。米家蓝牙温湿度计售价69元，很明显，带有“米家”
							名字的产品都可以与小米手机智能互
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="screen-box-col_right">
			<div class="col_right-admin">
				<div class="admin-bd">
					<div class="admin-bd-user">
						<a href="#"><img src="img/tao.jpg"/></a>
					</div>
						<c:if test="${empty user}">
							<span class="nihao">Hi!你好</span>
						</c:if>
						<c:if test="${!empty user}">
							<span class="nihao">Hi!${user.name}</span>
						</c:if>
					<p>
						<a href="#">
							<span class="jinbi-icon"></span>
							<span>领淘金币抵钱</span>
						</a>
						<a href="#">
							<span class="jinbi-icon"></span>
							<span>会员俱乐部</span>
						</a>

					</p>
				</div>
				<div class="admin-ft">
					<div class="admin-ft-box">
						<c:if test="${empty user}">
							<a href="login.jsp">登录</a>
							<a href="register.jsp">注册</a>
							<a href="#">开店</a>
						</c:if>
						<c:if test="${!empty user}">
							<a href="#">欢迎</a>
							<a href="forebought">${user.name}</a>
							<a href="forelogout">退出</a>
						</c:if>
					</div>
				</div>
			</div>
			<div class="col_right-report">
				<a href="#">网上有害信息举报专区</a>
			</div>
			<div class="col_right-notice">
				<ul class="notice-hd">
					<li><a href="" class="select">公告</a></li>
					<li><a href="">安全</a></li>
					<li><a href="">公益</a></li>
					<li><a href="">规则</a></li>
					<li><a href="">论坛</a></li>
				</ul>

				<div class="notice-bd">
					<ul class="notice-first">
						<li><a href="">阿里日喜逢中国品牌日</a></li>
						<li><a href="">张勇:企业品牌核心是文化</a></li>
						<li><a href="">阿里CEO致谢阿里家人</a></li>
						<li><a href="">阿里人的“扶贫新方式”</a></li>
					</ul>
				</div>
			</div>
			<div class="col_right-insurance">
				<div class="col_right-insurance-box">
					<img src="img/duanma.jpg"/>
				</div>
			</div>
			<div class="col_right-ali_app">
				<h3>
					阿里App
					<a href="#">更多></a>
				</h3>
				<ul>
					<li><a href="#"><img src="img/淘宝2.png" alt=""></a></li>
					<li><a href="#"><img src="img/天猫.png" alt=""></a></li>
					<li><a href="#"><img src="img/聚划算.png" alt=""></a></li>
					<li><a href="#"><img src="img/旺旺.png" alt=""></a></li>
					<li><a href="#"><img src="img/微信.png" alt=""></a></li>
					<li><a href="#"><img src="img/居乐乐app.png" alt=""></a></li>
					<li><a href="#"><img src="img/安卓.png" alt=""></a></li>
					<li><a href="#"><img src="img/qq.png" alt=""></a></li>
					<li><a href="#"><img src="img/apple.png" alt=""></a></li>
					<li><a href="#"><img src="img/百度地图.png" alt=""></a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="screen-goods-warp">
		<h3 class="goods-title">
			<span class="goods-title-1">|</span>
			<span class="goods-title-2">热卖单品</span>

		</h3>
		<div class="goods-hd">
			<ul>
				<c:forEach items="${cs}" var="c">
					<li cid="${c.id}">
						<a href="forecategory?cid=${c.id}">${c.name}</a>
					</li>
				</c:forEach>
			</ul>
		</div>
		<ul class="goods-bd">
			<c:forEach items="${cs}" var="c" begin="3" end="7">
				<c:forEach items="${c.products}" var="p" begin="1" end="2">
					<li>
						<a href="foreproduct?pid=${p.id}">
							<img src="img/productSingle_middle/${p.firstProductImage.id}.jpg" alt="" class="img-goods">
						</a>
						<a href="foreproduct?pid=${p.id}" class="goods-bd-line1">
							<img src="img/goods-包邮.png" alt="" class="img-ico">
							<span> ${fn:substring(p.name, 0, 50)}</span>
						</a>
						<div class="goods-bd-line2">
							<a href="foreproduct?pid=${p.id}">
								<span>评价</span>
								<span class="comment">${p.reviewCount}</span></a>
							</a>

							<a href="foreproduct?pid=${p.id}">
								<span>销量</span>
								<span class="like">${p.saleCount}笔</span>
							</a>
						</div>
						<div class="goods-bd-line3">
							<a href="foreproduct?pid=${p.id}" class="now-price">
								<fmt:formatNumber type="number" value="${p.promotePrice}" minFractionDigits="2"/>
							</a>

						</div>
					</li>
				</c:forEach>
			</c:forEach>

		</ul>
		<ul class="goods-ft">
			<li><a href=""><img src="img/goods-ft1.jpg" alt=""></a></li>
			<li><a href=""><img src="img/goods-ft2.jpg" alt=""></a></li>
			<li><a href=""><img src="img/goods-ft3.jpg" alt=""></a></li>
		</ul>


	</div>
	<div class="screen-footer-1">
		<div class="footer-count">
			<i class="box-count">count</i>
		</div>
	</div>
	<div class="screen-footer-2">
		<div class="screen-footer-box">
			<div class="footer-helper">
				<div class="footer-helper-warp helper-1">
					<h4>
						<span class="helper-ico"><img src="img/helper-盾牌.png" alt=""></span>
						<span class="helper-con">消费者保障</span>
					</h4>
					<ul>
						<li><a href="">保障范围</a></li>
						<li><a href="">退款退货流程</a></li>
						<li><a href="">服务专区</a></li>
						<li><a href="">更多特色服务</a></li>
					</ul>
				</div>
			</div>
			<div class="footer-helper">
				<div class="footer-helper-warp helper-2">
					<h4>
						<span class="helper-ico"><img src="img/helper-问号.png" alt=""></span>
						<span class="helper-con">新手上路</span>
					</h4>
					<ul>
						<li><a href="">新手专区</a></li>
						<li><a href="">消费警示</a></li>
						<li><a href="">交易安全</a></li>
						<li><a href="">24小时在线帮助</a></li>
					</ul>
				</div>
			</div>

			<div class="footer-helper">
				<div class="footer-helper-warp helper-3">
					<h4>
						<span class="helper-ico"><img src="img/helper-付款.png" alt=""></span>
						<span class="helper-con">付款方式</span>
					</h4>
					<ul>
						<li><a href="">快捷支付</a></li>
						<li><a href="">信用卡</a></li>
						<li><a href="">余额宝</a></li>
						<li><a href="">蚂蚁花呗</a></li>
					</ul>
				</div>
			</div>
			<div class="footer-helper">
				<div class="footer-helper-warp helper-4">
					<h4>
						<span class="helper-ico"><img src="img/helper-旺旺 .png" alt=""></span>
						<span class="helper-con">淘宝特色</span>
					</h4>
					<ul>
						<li><a href="">手机淘宝</a></li>
						<li><a href="">旺旺/旺信</a></li>
						<li><a href="">大众评审</a></li>

					</ul>
				</div>
			</div>
		</div>
	</div>






