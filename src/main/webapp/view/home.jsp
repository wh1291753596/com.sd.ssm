<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#sd").click(function() {
			$("#tushus").hide();
			$("#jianzhis").hide();
			$("#fulis").hide();
			$("#sds").show(300);
		});
		$("#jianzhi").click(function() {
			$("#fulis").hide();
			$("#tushus").hide();
			$("#sds").hide();
			$("#jianzhis").show(300);
		});
		$("#fuli").click(function() {
			$("#tushus").hide();
			$("#sds").hide();
			$("#jianzhis").hide();
			$("#fulis").show(300);
		});
		$("#tushu").click(function() {
			$("#sds").hide();
			$("#jianzhis").hide();
			$("#fulis").hide();
			$("#tushus").show(300);
		});

	})
</script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
		style="height:100px;background-color:white ;border-color:white;">
	<!--navbar-inverse 表示带反色（黑色背景，白色文字）的导航栏，navbar-fixed-top 表示 一直停留在顶部  添加 role="navigation"，有助于增加可访问性-->
	<div id="photostyle">
		<img src="../img/闪电速代.jpg" class="img-responsive" alt="SdCampus"
			style="height: 100%;width:100px;">
	</div>
	</nav>
	<!--表示只有在手机屏幕上才显示-->
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 100px; width: 100%; background-color:;">
		<!--表示这是轮播栏-->
		<div id="myCarousel" class="carousel slide" data-ride="carousel"
			style="width: 100%; height: 400px;">
			<!-- Indicators -->
			<!--这是轮播指标-->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1" class=""></li>
				<li data-target="#myCarousel" data-slide-to="2" class=""></li>
				<li data-target="#myCarousel" data-slide-to="3" class=""></li>
				<li data-target="#myCarousel" data-slide-to="4" class=""></li>
			</ol>
			<!--意思就是图片下面的几个小圆点-->

			<div class="carousel-inner" role="listbox">
				<!--第一页-->
				<div id="div0" class="item active">
					<img src="../img/2.png" alt="First slide"
						style="height: 400px; width: 100%;">
					<!--图片添加区域-->

				</div>
				<!--第二页-->
				<div class="item">
					<img src="../img/goods1.jpg" alt="Second slide"
						style="height: 400px; width: 100%;">
					<!--图片加载区-->

				</div>

				<!--第三页-->
				<div class="item">
					<img src="../img/goods1.jpg" alt="Third slide"
						style="height: 400px; width: 100%;">
					<!--图片加载区-->

				</div>
				<div class="item">
					<img src="../img/goods1.jpg" alt="Third slide"
						style="height: 400px; width: 100%;">
					<!--图片加载区-->

				</div>

				<div class="item">
					<img src="../img/goods1.jpg" alt="Third slide"
						style="height: 400px; width: 100%;">
					<!--图片加载区-->

				</div>
			</div>

		</div>

		<div style="width: 100%; height: 10px; background-color:;"></div>

		<!--以下的两栏都是图标栏-->
		<div id="myIcon"
			style="position: absolute; top: 410px; width: 100%; background-color: white; height: 120px;">
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/1.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/2.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/3.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/4.jpg" style="width: 60%; height:100px ;" />
			</div>
		</div>
		<div id="myIcon"
			style="position: absolute; top: 530px; width: 100%; background-color: white; height: 120px;">
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/5.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/6.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/7.jpg" style="width: 60%; height:100px ;" />
			</div>
			<div class="col-xs-3" style="text-align: center;">
				<img src="../img/8.jpg" style="width: 60%; height:100px ;" />
			</div>
		</div>

		<!--中间部分-->
		<div style="top: 650px; position: absolute; width: 100%;">
			<div style="width: 100%; height: 10px; background-color: gainsboro;"></div>
			<div id="fixed" style="width: 100%; position:;" class="">
				<ul class="nav nav-tabs">
					<li id="sd"
						style="width: 25%; font-size: xx-large; text-align: center;">
						<a href="#">快递</a>
					</li>
					<li id="jianzhi"
						style="width: 25%; font-size: xx-large; text-align: center;">
						<a href="#">兼职</a>
					</li>
					<li id="tushu"
						style="width: 25%; font-size: xx-large; text-align: center;">
						<a href="#">图书</a>
					</li>
					<li id="fuli"
						style="width: 25%; font-size: xx-large; text-align: center;">
						<a href="#">福利</a>
					</li>
				</ul>
			</div>

			<div style="width: 100%; height: 10px; background-color: gainsboro;"></div>
			<div id="sds">
				<div class="form-group"
					style="height: 350px; border: groove; border-radius: 5px;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						闪电校园旗下>></div>
					<div
						style="position: relative; height: 290px; width: 100%; background-color:; overflow: hidden;">
						<div class="col-xs-3"
							style="background-color:; height: 290px; text-align: center;">
							<img src="../img/快递.png" style="width: 80%; height: 80%;" />
						</div>
						<div class="col-xs-9" style="background-color:; height: 290px;">

							<div class="col-xs-9"
								style="text-align: left; font-size: 50px; font-family: '楷体'; color: blueviolet;">
								<br /> <b>闪电代取</b> <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--闪电侠配送
							</div>
							<div class="col-xs-3"
								style="background-color:; text-align: right;">
								<br />
								<br />
								<br />
								<br /> <span
									style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
								<span style="font-size: -webkit-xxx-large; color: red;"><b>￥1.90</b></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="jianzhis" style="display: none;">
				<div id="" class="form-group"
					style="position: relative; height: 430px; width: 100%; background-color:; overflow: hidden; border: groove;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3"
						style="background-color:; height: 300px; text-align: center;">
						<img src="../img/makesi.jpg" style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="background-color:; height: 300px; border:; border-radius: 25px;">
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: blueviolet;">国色天乡乐园三期</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--发传发传单发传单发传单发传单发传单发传单发传单发</p>
							<p style="font-size: 35px; font-family: '黑体'; color: red;">
								<b>100一天，周结</b>
							</p>
							<p style="font-size: 35px;">限时</p>
							<p style="font-size: 25px; font-family: times;">2018/2/17-2018/2/18</p>
						</div>
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br />
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥20.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥9.90</b></span>
						</div>
					</div>
					<div class="form-group"
						style="height: 70px; border:; border-radius: 10px;">
						<button
							style="background-color: bisque; border: hidden; border-radius: 30px; height: 60px; width: 200px; font-size: 35px; color: brown;">点击报名</button>
					</div>
				</div>
			</div>
			<div id="tushus" style="display: none;">
				<div id="" class="form-group"
					style="position: relative; height: 430px; width: 100%; background-color:; overflow: hidden; border: groove;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3"
						style="background-color:; height: 300px; text-align: center;">
						<img src="../img/makesi.jpg" style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="background-color:; height: 300px; border:; border-radius: 25px;">
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: blueviolet;">马克思主义基本原理</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--2013年高等教育出版社出版图书</p>
							<p style="font-size: 35px; font-family: '黑体'; color: red;">
								<b>同济大学应用数学系</b>
							</p>
							<p style="font-size: 35px;">书籍</p>
							<p style="font-size: 25px; font-family: times;">2018/2/13
								17:55-2018/3/13 17:55</p>
						</div>
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br />
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥20.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥99.90</b></span>
						</div>
					</div>
					<div class="form-group"
						style="height: 70px; border:; border-radius: 10px;">
						<button
							style="background-color: bisque; border: hidden; border-radius: 30px; height: 60px; width: 200px; font-size: 35px; color: brown;">点击购买</button>
					</div>
				</div>
				<div id="" class="form-group"
					style="position: relative; height: 430px; width: 100%; background-color:; overflow: hidden; border: groove;">
					<div
						style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						闪电校园旗下>></div>
					<div class="col-xs-3"
						style="background-color:; height: 300px; text-align: center;">
						<img src="../img/makesi.jpg" style="width: 80%; height: 80%;" />
					</div>
					<div class="col-xs-9"
						style="background-color:; height: 300px; border:; border-radius: 25px;">
						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 50px; font-family: '楷体'; color: blueviolet;">马克思主义基本原理</p>
							<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--2013年高等教育出版社出版图书</p>
							<p style="font-size: 35px; font-family: '黑体'; color: red;">
								<b>同济大学应用数学系</b>
							</p>
							<p style="font-size: 35px;">书籍</p>
							<p style="font-size: 25px; font-family: times;">2018/2/13
								17:55-2018/3/13 17:55</p>
						</div>
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br />
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥20.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥9.90</b></span>
						</div>
					</div>
					<div class="form-group"
						style="height: 70px; border:; border-radius: 10px;">
						<button
							style="background-color: bisque; border: hidden; border-radius: 30px; height: 60px; width: 200px; font-size: 35px; color: brown;">点击购买</button>
					</div>
				</div>
			</div>
			<div id="fulis" style="display: none;">
				<div id="" class="form-group"
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
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br />
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
						</div>
					</div>

				</div>
				<div id="" class="form-group"
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
						<div class="col-xs-3"
							style="background-color:; text-align: right;">
							<br />
							<br /> <span style="font-size: xx-large">X10</span> <br />
							<br />
							<br />
							<br /> <span
								style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
							<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
						</div>
					</div>

				</div>
			</div>

		</div>

		<!--底部导航栏-->

		<br /> <br /> <br /> <br /> <br /> <br />

		<nav class="navbar navbar-inverse navbar-fixed-bottom"
			role="navigation"
			style="height:80px;background-color: ;border-color:white;position: fixed;">
		<div class="col-xs-4"
			style="text-align: center; background-color: white;">
			<img src="../img/首页.jpg"
				style="width: 100%; height: 100%; margin: 0 auto; display: block; bottom: 0px; border: 0px; padding: 0px;" />

		</div>
		<div class="col-xs-4"
			style="text-align: center; background-color: white;">
			<img src="../img/订单.jpg"
				style="width: 100%; height: 100%; margin: 0 auto; display: block; bottom: 0px; border: 0px;" />
		</div>
		<div class="col-xs-4"
			style="text-align: center; background-color: white;">
			<img src="../img/我的.jpg"
				style="width: 100%; height: 100%; margin: 0 auto; display: block; bottom: 0px; border: 0px;" />
		</div>
		</nav>

	</div>

</body>
</html>