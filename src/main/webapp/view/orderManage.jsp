<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单管理</title>
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
				<br /> <br /> <br /> <br /> <img src="../img/151842100556939.png"
					style="width: 60%;" />
			</div>
			<br /> <br /> <br />			
			<div>
				<div class="form-group"
					style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">

					<div class="col-xs-9" style="text-align: left;">
						<div id="" style="float: left; height: 60px; background-color:;">
							<h1 style="color: orange; font-family: '楷体';">&nbsp;代取快递</h1>
						</div>
						<div id="" style="float: right; height: 60px;">
							<h1 style="color: crimson;">¥x.xx</h1>
						</div>
						<div style="position: absolute; top: 60px; font-family: times;">
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已下单--小闪即将开始工作</h3>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;下单时间：2018/2/12
								15:59:42</h3>
						</div>
					</div>
					<div class="col-xs-3" style="text-align: right; top: 10px;">
						<button type="button" class="btn  "
							style="width: 80%; height: 30%; background-color: bisque; color: olive;">
							<h4>我要找人</h4>
						</button>
						<br /> <br />
						<button type="button" class="btn "
							style="width: 80%; height: 30%; background-color: bisque;">
							<h4>删除</h4>
						</button>
					</div>
				</div>
				<hr size="3" style="background-color: black;" />
			</div>
			<div>
				<div class="form-group"
					style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">

					<div class="col-xs-9" style="text-align: left;">
						<div id="" style="float: left; height: 60px; background-color:;">
							<h1 style="color: orange; font-family: '楷体';">&nbsp;代取快递</h1>
						</div>
						<div id="" style="float: right; height: 60px;">
							<h1 style="color: crimson;">￥x.xx</h1>
						</div>
						<div style="position: absolute; top: 60px; font-family: times;">
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已取件--请您稍等片刻，快递即将送到您的手上</h3>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;下单时间：2018/2/12
								15:59:42</h3>
						</div>
					</div>
					<div class="col-xs-3" style="text-align: right; top: 10px;">

						<button type="button" class="btn  "
							style="width: 80%; height: 30%; background-color: bisque; color: olive;">
							<h4>我要找人</h4>
						</button>
						<br /> <br />
						<button type="button" class="btn "
							style="width: 80%; height: 30%; background-color: bisque;">
							<h4>删除</h4>
						</button>
					</div>
				</div>
				<hr size="3" style="background-color: black;" />
			</div>
			<div>
				<div class="form-group"
					style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">

					<div class="col-xs-9" style="text-align: left;">
						<div id="" style="float: left; height: 60px; background-color:;">
							<h1 style="color: orange; font-family: '楷体';">&nbsp;代取快递</h1>
						</div>
						<div id="" style="float: right; height: 60px;">
							<h1 style="color: crimson;">¥x.xx</h1>
						</div>
						<div style="position: absolute; top: 60px; font-family: times;">
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;未支付--请您及时支付哦</h3>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;下单时间：2018/2/12
								15:59:42</h3>
						</div>
					</div>
					<div class="col-xs-3" style="text-align: right; top: 10px;">

						<button type="button" class="btn  "
							style="width: 80%; height: 30%; background-color: bisque; color: olive;">
							<h4>我要找人</h4>
						</button>
						<br /> <br />
						<button type="button" class="btn "
							style="width: 80%; height: 30%; background-color: bisque;">
							<h4>去支付</h4>
						</button>
					</div>
				</div>
				<hr size="3" style="background-color: black;" />
			</div>
			<div onclick="">
				<div class="form-group"
					style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">

					<div class="col-xs-9" style="text-align: left;">
						<div id="" style="float: left; height: 60px; background-color:;">
							<h1 style="color: orange; font-family: '楷体';">&nbsp;代取快递</h1>
						</div>
						<div id="" style="float: right; height: 60px;">
							<h1 style="color: crimson;">¥x.xx</h1>
						</div>
						<div style="position: absolute; top: 60px; font-family: times;">
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;失败--快递公司找不到您的快递！如果您要自取，请删除订单</h3>
							<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;下单时间：2018/2/12
								15:59:42</h3>
						</div>
					</div>
					<div class="col-xs-3" style="text-align: right; top: 10px;">

						<button type="button" class="btn  "
							style="width: 80%; height: 30%; background-color: bisque; color: olive;">
							<h4>我要找人</h4>
						</button>
						<br /> <br />
						<button type="button" class="btn "
							style="width: 80%; height: 30%; background-color: bisque;">
							<h4>删除</h4>
						</button>
					</div>
				</div>
				<hr size="3" style="background-color: black;" />
			</div>
			<br /> <br /> <br /> <br />

		</form>
	</div>
</body>
</html>