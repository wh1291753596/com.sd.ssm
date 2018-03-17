<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>兼职发布</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<div class="hidden-lg hidden-md" style="position: absolute;top: 0px;width: 100%; background-color: bisque;">
			<form role="form">
				<div style="height: 100px;width: 100%;background-color: blueviolet;text-align: left;">
					<br />
					<div id="return">
						<img src="../img/返回.png" style="height: 70px;" />
					</div>
				</div>
				<div class="form-group">
					<br />
					<br />
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>兼职名称：<br></h1></label>
					<input type="text" class="form-control" id="name" name="name" placeholder="10个字以内" style="height: 50px;font-size: x-large;">		
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>联系方式：<br></h1></label>
					<input type="text" class="form-control" id="name" name="contact" placeholder="10个字以内" style="height: 50px;font-size: x-large;">						
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>兼职地点：<br></h1></label>
					<input type="text" class="form-control" id="location" name="location" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>兼职内容：<br></h1></label>
					<input type="text" class="form-control" id="detail" name="detail" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>兼职报酬：<br></h1></label>
					<input type="text" class="form-control" id="wage" name="wage" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>兼职人数：<br></h1></label>
					<input type="text" class="form-control" id="count" name="count" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>开始时间：<br></h1></label>
					<input type="text" class="form-control" id="start_time" name="start_time" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>结束时间：<br></h1></label>
					<input type="text" class="form-control" id="end_time" name="end_time" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
				</div>
				<br />
				<br />			
				<br />
				<br />
				<button type="submit" class="btn btn-success  btn-block" style="height: 80px;"><h2>确认提交</h2></button>
				<br />
				<br />
				<br />
			</form>
		</div>
</body>
</html>