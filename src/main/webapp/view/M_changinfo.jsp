<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改信息</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img src="../img/151885350284188.png"
					style="width: 60%;" />
			</div>
			<br /> <br />
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						代取时间：<br>
					</h1></label>
				<h2>
					于前日<input type="time" />--当日<input type="time" />下单，将于当日<input
						type="time" />--<input type="time" />送达<br />
					<br /> 于&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="time" />--------<input type="time" />下单，将于当晚送达
				</h2>
			</div>
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						代寄时间：<br>
					</h1></label>
				<h2>
					于前日<input type="time" />--当日<input type="time" />下单，将于当日<input
						type="time" />--<input type="time" />上门拿件<br />
					<br /> 于&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="time" />--------<input type="time" />下单，将于当晚<input
						type="time" />--<input type="time" />上门拿件
				</h2>
			</div>
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						代取价格：<br>
					</h1></label>
				<h2>
					中小件：<input type="number" step="0.1" name="points" min="0.1"
						max="10" />元<br />
					<br /> 大&nbsp;&nbsp;&nbsp;&nbsp;件：<input type="number" step="0.1"
						name="points" min="0.1" max="10" />-10元(据实际情况而定)
				</h2>
			</div>
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						代寄价格：<br>
					</h1></label> <input type="file" name="upload" id="upload"
					style="height: 70px; width: 70px;">
			</div>
			<br /> <br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>提交</h2>
			</button>
			<br /> <br /> <br />
		</form>

	</div>
</body>
</html>