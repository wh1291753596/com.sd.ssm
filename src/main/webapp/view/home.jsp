<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/sd_home.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#sd").click(function() {
			$("#tushus").hide();
			$("#works").hide();
			$("#fulis").hide();
			$("#sds").show(300);
		});
		$("#work").click(function() {
			$("#fulis").hide();
			$("#tushus").hide();
			$("#sds").hide();
			$("#works").show(300);
		});
		$("#fuli").click(function() {
			$("#tushus").hide();
			$("#sds").hide();
			$("#works").hide();
			$("#fulis").show(300);
		});
		$("#tushu").click(function() {
			$("#sds").hide();
			$("#works").hide();
			$("#fulis").hide();
			$("#tushus").show(300);
		});

	})
</script>
</head>
<body style="background-color: white;">

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
		style="height:100px;background-color:white;border-color:white;">
	<!--navbar-inverse 表示带反色（黑色背景，白色文字）的导航栏，navbar-fixed-top 表示 一直停留在顶部  添加 role="navigation"，有助于增加可访问性-->
	<div id="photostyle">
		<img src="../img/闪电速代.jpg" class="img-responsive" alt="SdCampus"
			style="height: 100%; width: 100px;">
	</div>
	</nav>
	<!--表示只有在手机屏幕上才显示-->
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 100px; width: 100%; background-color: white;">
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
					<img src="img/goods1.jpg" alt="Third slide"
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

		<div style="width: 100%; height: 10px;"></div>

		<!--以下的两栏都是图标栏-->
		<div id="myIcon"
			style="position: absolute; top: 410px; width: 100%; background-color: white; height: 120px;">
			<div id="daiqu" class="col-xs-3" style="text-align: center;">
				<img src="../img/1.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="daiji" onclick="hello()" class="col-xs-3"
				style="text-align: center;">
				<img src="../img/2.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="ershoushu" class="col-xs-3" style="text-align: center;">
				<img src="../img/3.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="jianzhi" class="col-xs-3" style="text-align: center;">
				<img src="../img/4.jpg" style="width: 60%; height: 100px;" />
			</div>
		</div>
		<div id="myIcon"
			style="position: absolute; top: 530px; width: 100%; background-color: white; height: 120px;">
			<div id="huodong" class="col-xs-3" style="text-align: center;">
				<img src="../img/5.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="kabao" class="col-xs-3" style="text-align: center;">
				<img src="../img/6.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="jiaoyu" class="col-xs-3" style="text-align: center;">
				<img src="../img/7.jpg" style="width: 60%; height: 100px;" />
			</div>
			<div id="songshui" class="col-xs-3" style="text-align: center;">
				<img src="../img/8.jpg" style="width: 60%; height: 100px;" />
			</div>
		</div>

		<!--中间部分-->
		<div
			style="top: 650px; position: absolute; width: 100%; background-color: white;">
			<div style="width: 100%; height: 10px;"></div>
			<div id="fixed" style="width: 100%; background-color: white;"
				class="">
				<ul class="nav nav-tabs">
					<li id="sd"
						style="width: 25%; font-size: xx-large; text-align: center;">
						<a href="#">快递</a>
					</li>
					<li id="work"
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

			<div style="width: 100%; height: 10px;"></div>

			<div id="sds">
				<form action="${pageContext.request.contextPath}/home/sds?m=0"
					method="post">
					<div class="form-group"
						style="height: 350px; border: groove; border-radius: 5px;">
						<div
							style="position: relative; height: 60px; width: 100%; font-size: 40px;">
							闪电校园旗下>></div>
						<div
							style="position: relative; height: 290px; width: 100%; overflow: hidden;">
							<div class="col-xs-3"
								style="background-color:; height: 290px; text-align: center;">
								<img src="../img/快递.png" style="width: 80%; height: 80%;" />
							</div>
							<div class="col-xs-9" style="height: 290px;">

								<div class="col-xs-9"
									style="text-align: left; font-size: 50px; font-family: '楷体'; color: blueviolet;">
									<br /> <b>闪电代取</b> <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--闪电侠配送
								</div>
								<div class="col-xs-3" style="text-align: right;">
									<br /> <br /> <br /> <br /> <span
										style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
									<span style="font-size: -webkit-xxx-large; color: red;"><b>￥1.90</b></span>
									<button class="btn  btn-warning btn-block" type="submit">购买</button>
								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
			<div id="works" style="display: none;">
				<form action="${pageContext.request.contextPath}/home/works?m=1"
					method="post">
					<div id="" class="form-group"
						style="position: relative; height: 410px; width: 100%; overflow: hidden; border: groove;">
						<div style="text-align: center;">
							<p style="font-size: 50px; font-family: '楷体'; color: blueviolet;">曼得语言诚聘校园兼职</p>
						</div>

						<div class="col-xs-9" style="text-align: left;">
							<p style="font-size: 35px; font-family: '宋体';">
								学生助理:协助校园负责人安排校内工作;<br /> 兼职:负责协助学校内讲座开展，试听课，设点宣传，咨询，单页派发，下寝
							</p>
							<p style="font-size: 35px; font-family: '黑体'; color: red;">
								<b>底薪+20/h+业绩提成</b>
							</p>
							<p style="font-size: 35px;">四川农业大学温江校区</p>
							<p style="font-size: 25px; font-family: times;">2018/2/17-2018/2/18</p>
						</div>
						<div class="col-xs-3" style="text-align: right;">
							<br /> <br /> <span style="font-size: xx-large;">人数需求</span> <br />
							<br /> <br /> <br /> <span
								style="font-size: -webkit-xxx-large; color: red;"><b>X10</b></span>

							<br /> <br />
							<button
								style="background-color:; border: hidden; height: 60px; width: 200px; font-size: 35px; color: brown;">点击报名</button>

						</div>

					</div>
				</form>
			</div>
			<div id="tushus" style="display: none;">
				<form action="${pageContext.request.contextPath}/home/tushus?m=2"
					method="post">
					<div id="" class="form-group"
						style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;">
						<div
							style="position: relative; height: 60px; width: 100%; font-size: 40px;">
							闪电校园旗下>></div>
						<div class="col-xs-3" style="height: 300px; text-align: center;">
							<br /> <img src="../img/makesi.jpg"
								style="width: 80%; height: 80%;" />
						</div>
						<div class="col-xs-9"
							style="height: 300px; border:; border-radius: 25px;">
							<br />
							<div class="col-xs-9" style="text-align: left;">
								<p id="title"
									style="font-size: 50px; font-family: '楷体'; color: brown;">马克思基本原理</p>
								<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--2013年高等教育出版社出版</p>
								<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;
									同济大学应用数学系</p>

							</div>
							<div class="col-xs-3" style="text-align: right;">
								<br /> <span id="kucun" style="font-size: xx-large">X100</span>
								<br /> <br /> <br /> <span id="yuanjia"
									style="text-decoration: line-through; font-size: xx-large;">￥19.50</span>
								<span id="xianjia"
									style="font-size: -webkit-xxx-large; color: red;"><b>￥4.00</b></span>
								<button class="btn  btn-warning btn-block" type="submit">购买</button>
							</div>
							<div style="display: none;">
								<input name="tushusid" type="text" value="5" />
								<!-- 	<input name="m"   type="hidden" value="1"> -->
							</div>
						</div>
					</div>
				</form>
			</div>
			<div id="fulis" style="display: none;">
				<form action="${pageContext.request.contextPath}/home/fulis?m=3"
					method="post">
					<div id="" class="form-group"
						style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;"
						href="javascript:form.submit();">
						<div
							style="position: relative; height: 60px; width: 100%; font-size: 40px;">
							闪电校园旗下>></div>
						<div class="col-xs-3" style="height: 300px; text-align: center;">
							<br /> <img src="../img/会员.png" style="width: 80%; height: 80%;" />
						</div>
						<div class="col-xs-9"
							style="height: 300px; border:; border-radius: 25px;">
							<br />
							<div class="col-xs-9" style="text-align: left;">
								<p style="font-size: 50px; font-family: '楷体'; color: brown;">闪电校园会员卡</p>
								<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--闪电校园旗下业务不要钱！！！</p>
								<p style="font-size: 35px;">2018/03/16-2018/04/16</p>

							</div>
							<div class="col-xs-3" style="text-align: right;">
								<!-- <br /> <span style="font-size: xx-large">X1</span> -->
								<br /> <br /> <br /> <span
									style="text-decoration: line-through; font-size: xx-large;">￥2.50</span>
								<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
								<button class="btn  btn-warning btn-block" type="submit">购买</button>
							</div>
							<div style="display: none;">
								<input name="fulisid" type="text" value="6" />
							</div>
						</div>

					</div>
				</form>
				<form action="${pageContext.request.contextPath}/home/fulis?m=3"
					method="post">
					<div id="" class="form-group"
						style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;"
						href="javascript:form.submit();">
						<div
							style="position: relative; height: 60px; width: 100%; font-size: 40px;">
							闪电校园旗下>></div>
						<div class="col-xs-3" style="height: 300px; text-align: center;">
							<br /> <img src="../img/free.png"
								style="width: 80%; height: 80%;" />
						</div>
						<div class="col-xs-9"
							style="height: 300px; border:; border-radius: 25px;">
							<br />
							<div class="col-xs-9" style="text-align: left;">
								<p style="font-size: 50px; font-family: '楷体'; color: brown;">闪电校园免单卡</p>
								<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--闪电代取不要钱！！！</p>
								<p style="font-size: 35px;">2018/03/16-2018/04/16</p>
							</div>
							<div class="col-xs-3" style="text-align: right;">
								<!-- <br /> <span style="font-size: xx-large">X10</span> -->
								<br /> <br /> <br /> <span
									style="text-decoration: line-through; font-size: xx-large;">￥20.50</span>
								<span style="font-size: -webkit-xxx-large; color: red;"><b>￥0.00</b></span>
								<button class="btn  btn-warning btn-block" type="submit">购买</button>
							</div>
						</div>
					</div>
				</form>
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
		<div id="dingdan" class="col-xs-4"
			style="text-align: center; background-color: white;">
			<img src="../img/订单.jpg"
				style="width: 100%; height: 100%; margin: 0 auto; display: block; bottom: 0px; border: 0px;" />
		</div>
		<div id="wode" class="col-xs-4"
			style="text-align: center; background-color: white;">
			<img src="../img/我的.jpg"
				style="width: 100%; height: 100%; margin: 0 auto; display: block; bottom: 0px; border: 0px;" />
		</div>
		</nav>

	</div>

</body>
<script type="text/javascript">
	var but1 = document.getElementById("wode");
	var but2 = document.getElementById("dingdan");
	but2.onclick = function() {
		window.location.href = "../view/orderManage.jsp";
	}
	but1.onclick = function() {
		window.location.href = "../view/my.jsp";
	}
	var photo1 = document.getElementById("daiqu");
	photo1.onclick = function() {
		window.location.href = "../view/fetch.jsp";
	}
	var photo2 = document.getElementById("daiji");
	photo2.onclick = function() {
		//window.location.href = "${pageContext.request.contextPath}/consign/up";
		window.location.href = "../view/consign.jsp";
	}
	/* function hello(){
		var btn9 = document.getElementById("daiji");
		btn9.src="${pageContext.request.contextPath}/consign/up";
	} */
	//function hello() {
	//window.location.href="${pageContext.request.contextPath}/consign/up";
	//}
	var photo3 = document.getElementById("ershoushu");
	var but3 = document.getElementById("tushu");
	photo3.onclick = function() {
		but3.click();
	}
	var photo4 = document.getElementById("jianzhi");
	var but4 = document.getElementById("work");
	photo4.onclick = function() {
		but4.click();
	}
	var photo5 = document.getElementById("huodong");
	var but5 = document.getElementById("fuli");
	photo5.onclick = function() {
		but5.click();
	}
	var photo6 = document.getElementById("kabao");
	photo6.onclick = function() {
		window.location.href = "../view/myTicket.jsp";
	}
	var photo7 = document.getElementById("jiaoyu");
	var photo8 = document.getElementById("songshui");
</script>
</html>