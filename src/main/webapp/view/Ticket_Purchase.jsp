<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卡券购买页面</title>
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
				<br /> <br /> <br /> <br /> <img
					src="../img/151853301694370.png" style="width: 60%;" />
			</div>
			<br /> <br /> <br /> <br />
			<div class="form-group"
				style="height: 260px; border: groove; border-radius: 25px;">
				<div class="col-xs-1" style="text-align: center; height: 160px;">
					<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <img
						src="../img/地址.png" />

				</div>
				<c:forEach items="${defaultAddress}" var="defaultAddress">
					<div class="col-xs-11">
						<div id="" style="float: left; height: 60px; background-color:;">
							<br /> <br />
							<h1 style="color: orange; font-family: '楷体';">&nbsp;收件人：${defaultAddress.receiver}</h1>

						</div>
						<div id="" style="float: right; height: 60px;">
							<br /> <br />
							<h1 style="color: crimson;">${defaultAddress.phone}</h1>
						</div>
						<div style="position: absolute; top: 60px; font-family: times;">
							<br /> <br />
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;收货地址：${defaultAddress.area}</h3>
							<br />
							<h2 style="font-family: '黑体';">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <u>${defaultAddress.detail}</u>
							</h2>
						</div>
						<div style="right: 50px; position: absolute;">
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<h1 style="color: orange; font-family:;">&nbsp;￥x.xx</h1>
						</div>
					</div>
				</c:forEach>
			</div>

			<c:forEach items="${oCouponsInfos}" var="oCouponsInfos">
				<div class="form-group"
					style="position: relative;  width: 100%; overflow: hidden; border: groove;">

					<div
						style="position: relative; height: 60px; width: 100%; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3" style="height: 300px; text-align: center;">
						<br /> <img src="${oCouponsInfos.imageSrc}"
							style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="height: 300px; border:; border-radius: 25px;">
						<br />
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: brown;">${oCouponsInfos.name}</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--${oCouponsInfos.description}</p>
							<p style="font-size: 35px;">${oCouponsInfos.creatTime}--${oCouponsInfos.endTime}</p>

						</div>
						<div class="col-xs-3" style="text-align: right;">
							<!-- <br /> <span style="font-size: xx-large">X1</span> -->
							<br /> <br /> <br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥${oCouponsInfos.money}</b></span>						
						</div>
						<div style="display: none;">
							<input name="fulisid" type="text" value="6" />
						</div>
					</div>
				</div>

				<br />
				<div class="form-group"
					style="position: fixed; bottom: 0px; height: 90px; background-color: bisque; width: 100%;">

					<div class="col-xs-9" style="background-color:; text-align: right;">
						<h1 style="height: 100%;">
							合计：<b style="color: red;">￥${oCouponsInfos.money}</b>
						</h1>
					</div>
					<div class="col-xs-3"
						style="background-color: red; text-align: center; height: 100%;">
						<br /> <b style="font-size: 45px; background-color:;">结&nbsp;算</b>
					</div>
				</div>
			</c:forEach>
		</form>
	</div>
</body>
</html>