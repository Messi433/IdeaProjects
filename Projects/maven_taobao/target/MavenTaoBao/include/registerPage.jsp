<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<link rel="stylesheet" href="css/register.css">
<div id="screen-reg-warp" class="reg-page">
	<div class="reg-hd">
		<div class="logo">
			<h1><a href="index.jsp"><img src="img/register-淘宝网logo1.png" alt=""></a></h1>
			<h2 class="tsl">用户注册</h2>
		</div>
	</div>
	<div class="reg-step">
		<ol>
			<li class="active">
				<b class="active 1">1</b>
				<span>设置用户名</span>
			</li>
			<li>
				<b class="2">2</b>
				<span>填写账号信息</span>
			</li>
			<li>
				<b class="3">3</b>
				<span>设置支付方式</span>
			</li>
			<li>
				<b class="4">4</b>
				<span>注册成功</span>
			</li>
		</ol>
	</div>
	<div class="reg-bd">
		<div id="screen-reg-warp" class="reg-page">
			<div class="registerErrorMessageDiv" style="visibility: visible;">
				<div class="alert alert-danger" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
					<span class="errorMessage"></span>
				</div>
			</div>
			<script>
                <c:if test="${!empty msg}">//如果有错误提示信息
                $("span.errorMessage").html("${msg}");
                $("div.registerErrorMessageDiv").show();
                </c:if>

                $(".registerForm").submit(function () {
                    if (0==$("#name").val().length){
                        $("span.errorMessage").html("请输入用户名");
                        $("span.registerErrorMessageDiv").show();
                        return false;
                    }
                    if (0==$("#password").val().length){
                        $("span.errorMessage").html("请输入密码");
                        $("span.registerErrorMessageDiv").show();
                        return false;
                    }
                    if (0==$("#repeatpassword").val().length){
                        $("span.errorMessage").html("请输入重复密码");
                        $("span.registerErrorMessageDiv").show();
                        return false;
                    }
                    if ($("#password").val()!=$("#repeatpassword").val()){
                        $("span.errorMessage").html("两次密码不一致");

                        $("span.registerErrorMessageDiv").show();
                        return false;
                    }

                    return true;
                });

			</script>
			<form action="foreregister" method="POST" class="registerForm">
				<table class="reg-table">
					<tbody>
					<tr>
						<td class="reg-tip reg-bg-td">设置会员名</td>
						<td></td>
					</tr>
					<tr>
						<td class="reg-bg-td">登录名</td>
						<td>
							<input id="name" name="name" placeholder="会员名一旦设置成功，无法修改" class="inp">
						</td>
					</tr>
					<tr>
						<td class="reg-tip  reg-bg-td">设置登录密码</td>
						<td>登陆时验证，保护账号信息</td>
					</tr>
					<tr>
						<td class="reg-bg-td">登录密码</td>
						<td>
							<input id="password" name="password" placeholder="设置你的登陆密码" type="password"
								   class="inp">
						</td>
					</tr>
					<tr>
						<td class="reg-bg-td">密码确认</td>
						<td>
							<input id="repeatpassword" placeholder="请再次输入你的密码" type="password" class="inp">
						</td>
					</tr>
					<tr>
						<td class="reg-bg-btn" colspan="2" >
							<input type="submit" value="提交" class="btn" id="sub">
							<input type="submit" value="重置" class="btn" id="clear">
						</td>

					</tr>

					</tbody>
				</table>

			</form>
			<div class="reg-change"><a href="">切换成企业账号注册</a></div>
		</div>
		<div class="reg-ft">
			<a href="#">
				"淘宝注册"改进建议
			</a>
		</div>
	</div>
</div>
