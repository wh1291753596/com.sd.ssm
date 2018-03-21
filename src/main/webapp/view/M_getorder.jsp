<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接单展示</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div id="" class="form-group"
				style="position: relative; height: 400px; width: 100%; overflow: hidden; border: groove;">

				<br />
				<div class="col-xs-9" style="text-align: left;">
					<p id="title"
						style="font-size: 50px; font-family: '楷体'; color: brown;">顺丰快递</p>
					<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;地址：4公寓2单元305</p>
					<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;下单时间：2018/03/12
						13:02</p>
					<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;时间区间：2小时内</p>
					<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;快递类型：大件物品</p>
					;
				</div>
				<div class="col-xs-3" style="background-color:; text-align: right;">
					<br /> <span id="num"
						style="font-size: -webkit-xxx-large; color: red; display: none;"><b>取货码：12845</b></span>
							
					<br /> <span id="xianjia"
						style="font-size: -webkit-xxx-large; color: red;"><b>接单需知：</b></span>
					<span id="xianjia" style="font-size: xx-large; color: red;"><b>一旦接单</b></span><br />
					<span id="xianjia" style="font-size: xx-large; color: red;"><b>不能修改</b></span>
					<button onclick="return res()" type="submit"
						class="btn btn-success  btn-block" style="height: 80px;">
						<h2>接单</h2>
					</button>
				</div>

			</div>
		</form>
	</div>
</body>
<script>
	function res() {
		if (confirm("确认接单吗？")) {
			var a = document.getElementById("num").innerHTML;
			alert(a);
			return true;
			location.reload();
		} else {
			return false;
		}
	}
</script>
</html>