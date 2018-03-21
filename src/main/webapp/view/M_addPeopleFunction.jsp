<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加后台人员功能</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%;">
		<form role="form">
			<div class="form-group" style="font-size: 30px;">
			<label>用户id：</label> <input type="text" name="userid" placeholder="请输入用户id"><br><br>
				<label>角色：</label> <select class="form-control"
					style="height: 50px; font-size: x-large;">
					<option>快递管理员</option>
					<option>跑腿工作者</option>
					<option>其他板块</option>
				</select> <br> <br> <label>权限：</label> <select class="form-control"
					style="height: 50px; font-size: x-large;">
					<option>管理代取</option>
					<option>管理代寄</option>
					<option>跑腿快递</option>
					<option>管理图书</option>
					<option>管理卡券</option>
					<option>管理兼职</option>
				</select> <br> <br>
			</div>
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>验证后添加</h2>
			</button>
		</form>
	</div>
</body>
</html>