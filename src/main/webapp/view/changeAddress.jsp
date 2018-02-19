<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改地址</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#student").click(function() {
			$("#teacherPlace").hide();
			$("#otherPlace").hide();
			$("#studentsPlace").show(500);
		});
		$("#teacher").click(function() {
			$("#otherPlace").hide();
			$("#studentsPlace").hide();
			$("#teacherPlace").show(500);
		});
		$("#other").click(function() {
			$("#teacherPlace").hide();
			$("#studentsPlace").hide();
			$("#otherPlace").show(500);
		});
	});
</script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img src="../img/151836660418581.png"
					style="width: 60%;" />
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						收件人姓名&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="请输入收件人姓名" style="height: 50px; font-size: x-large;">
			</div>
			<div>
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						收件人电话&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="请输入收件人电话" style="height: 50px; font-size: x-large;">
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						所在地区&nbsp;*：<br>
					</h1></label> <select class="form-control"
					style="height: 50px; font-size: x-large;">
					<option>四川省成都市温江区四川农业大学</option>
				</select>
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						详细地址&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="请输入详细地址" style="height: 50px; font-size: x-large;">
			</div>
			<div id="apartmentType" class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						详细地址&nbsp;*：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						id="student" name="judge" type="radio" value=""
						style="height: 20px; width: 20px;" checked />学生公寓</label> <label><input
						id="teacher" name="judge" type="radio" value=""
						style="height: 20px; width: 20px;" />教师公寓</label> <label><input
						id="other" name="judge" type="radio" value=""
						style="height: 20px; width: 20px;" />其他</label>
				</h2>
			</div>
			<div id="otherPlace" class="form-group" style="display: none;">
				<input type="text" class="form-control" id="firstname"
					placeholder="请输入详细地址" style="height: 50px; font-size: x-large;">
			</div>
			<div id="teacherPlace" class="form-group" style="display: none;">
				<div class="col-xs-6" style="height: 50px;">
					<select class="form-control"
						style="height: 50px; font-size: x-large;">
						<option>29栋一单元</option>
						<option>27栋一单元</option>
						<option>28栋一单元</option>
					</select>
				</div>
				<div class="col-xs-6" style="height: 50px;">
					<input type="text" class="form-control" id="firstname"
						placeholder="示例：4楼01号寝室输入：4-01"
						style="height: 50px; font-size: x-large;">
				</div>
			</div>
			<div id="studentsPlace" class="form-group" style="display:;">
				<div class="col-xs-6" style="height: 50px;">
					<select class="form-control"
						style="height: 50px; font-size: x-large;">
						<option>4公寓1单元</option>
						<option>4公寓2单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓1单元</option>
						<option>4公寓2单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
						<option>4公寓3单元</option>
					</select>
				</div>
				<div class="col-xs-6" style="height: 50px;">
					<input type="text" class="form-control" id="firstname"
						placeholder="示例：4楼01号寝室输入：4-01"
						style="height: 50px; font-size: x-large;">
				</div>
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						是否设为默认地址&nbsp;*：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label><input
						id="student" name="yesOrno" type="radio" value=""
						style="height: 20px; width: 20px;" checked />是</label>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label><input
						id="teacher" name="yesOrno" type="radio" value=""
						style="height: 20px; width: 20px;" />否</label>
				</h2>
			</div>
			<br /> <br /> <br /> <br /> <br /> <br /> <br />
			<div style="text-align: center;">
				<button type="submit" class="btn "
					style="height: 70px; background-color: goldenrod; width: 80%; border-radius: 25px;">
					<h2>+删除+</h2>
				</button>
				<br /> <br />
				<button type="submit" class="btn "
					style="height: 70px; background-color: goldenrod; width: 80%; border-radius: 25px;">
					<h2>+提交+</h2>
				</button>
			</div>
		</form>
	</div>
</body>
</html>