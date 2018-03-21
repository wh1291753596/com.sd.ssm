<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加后台人员页面</title>
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
			<br>
			<label>用户id：</label> <input type="text" name="userid"><br><br>
			<label>用户名：</label> <input type="text" name="username"><br><br>
			<label>真实姓名：</label> <input type="text" name="name"><br><br>
			<label>联系QQ：</label> <input type="text" name="qq"><br><br>
			<label>联系电话：</label> <input type="text" name="phone"><br><br>
			<label>寝室地址：</label> <input type="text" name="address"><br><br>
			
			</div>
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>添加</h2>
			</button>
		</form>
	</div>
</body>
</html>