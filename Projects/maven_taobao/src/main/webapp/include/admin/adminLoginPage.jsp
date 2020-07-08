
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>


<script>
$(function(){
	<c:if test="${!empty msg}">
	$("p.error").html("${msg}");
	$("div.errorMessage").show();
	</c:if>
	
	$("form.loginForm").submit(function(){
		if(0==$("#name").val().length||0==$("#password").val().length){
			$("p.error").html("请输入账号密码");
			$("div.errorMessage").show();
			return false;
		}
		return true;
	});
	
	$("form.loginForm input").keyup(function(){
		$("div.errorMessage").hide();
	});
	
	
	
	var left = window.innerWidth/2+162;
	$("div.loginSmallDiv").css("left",left);
})
</script>
<div id="page">
	<div id="header" class="clearfix">

		<div class="logo-box">
			<h1>
				<a href="" class="logo">
					<img src="../img/taobaologo1.jpg" alt="" class="taobao">

				</a>

			</h1>
			<div class="header-login_message">
				<p>
					为确保您账户的安全及正常使用，依《网络安全法》相关要求，6月1日起会员账户
					需绑定手机。如您还未绑定，请尽快完成，感谢您的理解及支持！
				</p>
			</div>
			<a href="" class="link">
				<img src="img/login-信息.png" alt="" class="icon">
				"登录页面"改进建议</a>
		</div>

	</div>
	<div id="content">
		<div class="content-box">
			<style>
				.error-box{

					width: 300px;
					height: 30px;
					margin: 10px auto;
				}
				.errorMessage{
					display: none;

					border: 1px solid #ffb4a8;
					background-color: #fef2f2;
					color: #6C6C6C;
					width: 300px;
					height: 30px;
					line-height: 10px;
				}
				.errorMessage .error{
					white-space: normal;
					word-wrap: break-word;
					width: 240px;
					font-size: 12px;
					font-family: Arial;
					color: #3c3c3c;
					display: inline-block;
				}
				.errorMessage img{
					display: inline-block;
					width: 16px;
					height: 16px;
					position: relative;
					top: 2px;
				}
			</style>

			<div class="login-box">
				<div class="error-box">
					<div class="errorMessage" >
						<img src="img/error.png" alt="">
						<p class="error">请输入账户密码</p>
					</div>
				</div>
				<div class="box-warp">
					<div class="login-bd">
						<div class="login-bd-pw_login">
							<div class="login-title">
								后台登录
							</div>
							<form action="admin_backLogin_login" method="POST" id="login-form" class="loginForm">
								<div class="field login-username">
									<img src="../img/login-user.png" alt="">
									<input  type="text" placeholder="会员名/邮箱/手机号" id="name" name="name" >
								</div>
								<div class="field login-pw">
									<img src="../img/login-password.png" alt="">
									<input type="password" id="password" placeholder="密码" name="password">
								</div>
								<div class="login-submit">
									<input type="submit" value="登录">
								</div>
								<ul>
									<li class="login-li1">
										<img src="../img/login-微博.png" alt="">
										<a href="">微博登录</a>
									</li>
									<li class="login-li2">
										<img src="../img/login-支付宝.png" alt="">
										<a href="">支付宝登录</a>
									</li>
								</ul>

								<div class="login-link">
									<a href="register.jsp" class="">忘记密码</a>
									<a href="register.jsp" class="a2">忘记会员名</a>
									<a href="register.jsp" class="a3">免费注册</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>