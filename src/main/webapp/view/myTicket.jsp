<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的卡券</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#youxiao").click(function() {
			$("#youxiaos").toggle(400);
		});
		$("#yishiyong").click(function() {
			$("#yishiyongs").toggle(400);
		});
		$("#weiyongyou").click(function() {
			$("#weiyongyous").toggle(400);
		});
	})
</script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img src="../img/151851335876919.png"
					style="width: 60%;" />
			</div>
			<br /> <br /> <br /> <br />

			<div id="youxiao" class="form-group"
				style="height: 60px; border: groove; border-radius: 5px;">
				<div
					style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
					有效卡券>></div>
			</div>
			<div id="youxiaos" class="form-group"
					style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color:; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3"
						style="background-color:; height: 300px; text-align: center;">
						<br /> <img src="../img/会员.png" style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="background-color:; height: 300px; border:; border-radius: 25px;">
						<br />
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: brown;">闪电校园会员卡</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--闪电校园旗下业务不要钱！！！</p>
							<p style="font-size: 35px;">月卡</p>

						</div>
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br /> <span style="font-size: xx-large">X1</span> <br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
						</div>
					</div>
				</div>

			<div id="yishiyong" class="form-group"
				style="height: 60px; border: groove; border-radius: 5px;">
				<div
					style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
					未拥有卡券>></div>
			</div>

			<div id="yishiyongs" class="form-group"
					style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;display: none;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color:; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3"
						style="background-color:; height: 300px; text-align: center;">
						<br /> <img src="../img/free.png" style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="background-color:; height: 300px; border:; border-radius: 25px;">
						<br />
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: brown;">闪电校园免单卡</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--闪电代取不要钱！！！</p>
							<p style="font-size: 35px;">次卡</p>
						</div>
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥20.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
						</div>
					</div>
				</div>

			

			
		</form>
	</div>
</body>
</html>