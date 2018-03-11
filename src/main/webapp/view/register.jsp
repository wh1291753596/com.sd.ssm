<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>注册</title>
<link
	href="http://cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="../css/signin.css" />
<link rel="stylesheet" href="../css/htmleaf-demo.css" />

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="htmleaf-container">
		<header class="htmleaf-header">
		<h1>欢迎注册闪电校园</h1>
		<div class="htmleaf-links">
			<a class="htmleaf-icon icon-htmleaf-home-outline" href=""
				title="A5源码" target="_blank"><span> 首页</span></a> <a
				class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href=""
				title="返回下载页" target="_blank"><span> 返回</span></a>
		</div>
		</header>
		<div class="signin">
			<div class="signin-head">
				<img src="../img/闪电速代.jpg" alt="" class="img-rounded img-responsive">
			</div>
			<form class="form-signin" role="form" onsubmit="return formCheck()"
				action="${pageContext.request.contextPath}/register/up"
				method="post">
				<input id="username" type="text" name="username"
					class="form-control" placeholder="用户名(请牢记)" required autofocus /> <input
					id="password" type="password" name="password" class="form-control"
					placeholder="密码(请牢记)" required /> <input id="affirmpassword" type="password"
					name="affirmpassword" class="form-control" placeholder="确认密码(请牢记)" required />
				<button id="register" class="btn btn-lg btn-warning btn-block"
					type="submit">注册</button>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	function formCheck() {
		var password = document.getElementById("password").value;
		var affirmpassword = document.getElementById("affirmpassword").value;
		if(password != affirmpassword) {
			alert("两次输入的密码不一致！");
			return false;
		}
		return true;
	}
	/* function check() {

		if (passwords != affirmpasswords) {
			alert(你好);
		} else {

		}
	} */
</script>
</html>