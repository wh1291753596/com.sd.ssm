<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购买订单</title>
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
				<br /> <br /> <br /> <br /> <img src="../img/151853301694370.png"
					style="width: 60%;" />
			</div>
			<br /> <br /> <br /> <br />
			<div class="form-group"
				style="height: 260px; border: groove; border-radius: 25px;">
				<div class="col-xs-1" style="text-align: center; height: 160px;">
					<br />
					<br />
					<br />
					<br />
					<br />
					<br />
					<br />
					<br /> <img src="../img/地址.png" />

				</div>
				<div class="col-xs-11">
					<div id="" style="float: left; height: 60px; background-color:;">
						<br />
						<br />
						<h1 style="color: orange; font-family: '楷体';">&nbsp;收件人：王浩</h1>

					</div>
					<div id="" style="float: right; height: 60px;">
						<br />
						<br />
						<h1 style="color: crimson;">18160072938</h1>
					</div>
					<div style="position: absolute; top: 60px; font-family: times;">
						<br />
						<br />
						<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收货地址：四川省成都市温江区四川农业大学</h3>
						<br />
						<h2 style="font-family: '黑体';">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>学生公寓3栋4-11</u>
						</h2>
					</div>
					<div style="right: 50px; position: absolute;">
						<br />
						<br />
						<br />
						<br />
						<br />
						<br />
						<br />
						<br />
						<h1 style="color: orange; font-family:;">&nbsp;￥x.xx</h1>
					</div>
				</div>
			</div>

			<div class="form-group"
				style="position: relative; height: 500px; width: 100%; background-color:; overflow: hidden; border: groove;">
				<div
					style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
					闪电校园旗下>></div>
				<div class="col-xs-3"
					style="background-color:; height: 300px; text-align: center;">
					<img src="../img/免费.png" style="width: 80%; height: 80%;" />
				</div>
				<div class="col-xs-9"
					style="background-color:; height: 300px; border:; border-radius: 25px;">
					<div class="col-xs-9" style="text-align: left;">
						<p style="font-size: 50px; font-family: '楷体'; color: blueviolet;">闪电校园免单卡</p>
						<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--闪电校园旗下业务</p>
						<p style="font-size: 35px; font-family: '黑体'; color: red;">
							<b>免单人工费！！！</b>
						</p>
						<p style="font-size: 35px;">次卡</p>
						<p style="font-size: 25px; font-family: times;">2018/1/13
							17:55-2018/2/13 17:55</p>
					</div>
					<div class="col-xs-3" style="background-color:; text-align: right;">
						<br />
						<br /> <span style="font-size: xx-large">X10</span> <br />
						<br />
						<br />
						<br /> <span
							style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
						<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
					</div>
				</div>
				<div class="form-group"
					style="height: 140px; border:; border-radius: 10px;">
					<h2>
						配送方式：<u><b>闪电侠配送</b></u>
					</h2>
					<!--<label class="alert-success" style="text-align: left;background-color: bisque;"><h1>备注&nbsp;：<br></h1></label>-->
					<textarea class="form-control" rows="2" placeholder="请输入留言(可选)"
						style="font-size: x-large;"></textarea>
				</div>
			</div>

			<br />
			<div class="form-group"
				style="position: fixed; bottom: 0px; height: 250px; background-color: bisque; width: 100%;">
				<div class="form-group" style="height: 40px; width: 100%;">
					<b style="font-size: 40px;">使用闪电校园会员卡</b> <input name="choose"
						type="radio" value=""
						style="height: 40px; width: 40px; float: right;" />

				</div>
				<div class="form-group" style="height: 40px; width: 100%;">
					<b style="font-size: 40px;">使用闪电校园代取卡</b> <input name="choose"
						type="radio" value=""
						style="height: 40px; width: 40px; float: right;" />
				</div>
				<div class="form-group" style="height: 40px; width: 100%;">
					<b style="font-size: 40px;">使用闪电校园免单卡</b> <input name="choose"
						type="radio" value=""
						style="height: 40px; width: 40px; float: right;" />
				</div>
				<div class="col-xs-9" style="background-color:; text-align: right;">
					<h1 style="height: 100%;">
						合计：<b style="color: red;">￥10.00</b>
					</h1>
				</div>
				<div class="col-xs-3"
					style="background-color: red; text-align: center; height: 100%;">
					<br /> <b style="font-size: 45px; background-color:;">结&nbsp;算</b>
				</div>
			</div>

		</form>
	</div>
</body>
</html>