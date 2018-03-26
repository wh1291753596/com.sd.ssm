<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交失败</title>
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
		<div
			style="height: 100px; width: 100%; background-color: blueviolet; text-align: left;">
			<br />
			<div id="return">
				<img src="../img/返回.png" style="height: 70px;" />
			</div>

		</div>
		<div style="text-align: center;">
			<br /> <br /> <br /> <br /> <br /> <br />
			<br />
			<br />
			<br /> <br /> <br /> <br />
			<br />
			<br />
			<br />
			<br />
			<br />
			<br />
			<br />
			<br /> <img src="../img/提交成功.png" />
			<p>
			<h2>操作失败</h2>
			</p>
			<button type="submit" style="height: 80px; width: 500px;">
				<h2>返回</h2>
			</button>
		</div>
	</div>
</body>
<script type="text/javascript">
	var ojbk = document.getElementById('return');
	ojbk.onclick = function() {
		window.location.href = "home.jsp";
	}
</script>
</body>
</html>