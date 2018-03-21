<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>地址管理</title>
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
					src="../img/151827704948161.png" style="width: 60%;" />
			</div>
			<br /> <br /> <br />
			<!--这是地址信息-->
			<div>
				<c:forEach items="${defaultAddress}" var="list">
					<div class="form-group"
						style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">

						<div class="col-xs-10" style="text-align: left;">
							<div id="" style="float: left; height: 60px; background-color:;">
								<h1 style="color:; font-family: '楷体';">&nbsp;${list.receiver}</h1>
							</div>
							<div id="" style="float: right; height: 60px; background-color:;">
								<h2>${list.phone}</h2>
							</div>
							<div style="position: absolute; top: 60px; background-color:;">
								<h2>&nbsp;&nbsp;${list.area}--${list.detail}</h2>
							</div>
						</div>
						<div class="col-xs-2" style="text-align: right;">
							<input id="show" name="judge" type="radio" value=""
								style="height: 30px; width: 30px;" checked />
							<h3>当前地址</h3>						
						</div>
						<div style="display: none;">
								<input name="notdefalut" type="text" value="${list.id}" />
						</div>
					</div>
					<hr size="3" style="background-color: black;" />
				</c:forEach>
			</div>


			<div>
				<c:forEach items="${notdefaultAddress}" var="notdefaultAddresslist">
					<div class="form-group"
						style="height: 160px; border: groove; border-radius: 25px; border-width: thick;">
						<div class="col-xs-10" style="text-align: left;">
							<div id="" style="float: left; height: 60px; background-color:;">
								<h1 style="color:; font-family: '楷体';">&nbsp;${notdefaultAddresslist.receiver}</h1>
							</div>
							<div id="" style="float: right; height: 60px; background-color:;">
								<h2>${notdefaultAddresslist.phone}</h2>
							</div>
							<div style="position: absolute; top: 60px; background-color:;">
								<h2>&nbsp;&nbsp;${notdefaultAddresslist.area}--${notdefaultAddresslist.detail}</h2>
							</div>
						</div>
						<div class="col-xs-2" style="text-align: right;">
							<br><br><br><br>
							
							<h3><a href="${pageContext.request.contextPath}/AddressManage/revise?notdefalut=${notdefaultAddresslist.id}">编辑</a></h3>
						</div>
						<div style="display: none;">
								<input name="notdefalut" type="text" value="${notdefaultAddresslist.id}" />
						</div>
					</div>
					<hr size="3" style="background-color: black;" />
				</c:forEach>
			</div>


		
			<br /> <br /> <br /> <br />
			<div style="text-align: center;">
				<button type="submit" class="btn "
					style="height: 80px; background-color: goldenrod; width: 80%; border-radius: 25px;">
					<h2>+添加地址+</h2>
				</button>
			</div>

			<br /> <br />
		</form>
		<nav class="navbar  navbar-fixed-bottom" role="navigation" style="height:100px;background-color: ;border-color:white;position: fixed;">
	<div id="home" class="col-xs-4" style="text-align: center; background-color: white;padding: 3px;">
		<img src="../img/首页.jpg" style=" height: 100%;width: 100%; " />
	</div>
	<div  class="col-xs-4" style="text-align: center; background-color: white;padding: 3px;">
		<img src="../img/订单.jpg" style="height: 100%;width: 100%; "/>
	</div>
	<div id="my"  class="col-xs-4" style="text-align: center; background-color: white;padding: 3px;">
		<img src="../img/我的.jpg" style="height: 100%;width: 100%; " />
	</div>
</nav>
	</div>
</body>
<script type="text/javascript">
var but2 = document.getElementById("my");
but2.onclick = function() {
	window.location.href = "../view/my.jsp";
}
var home = document.getElementById("home");
but2.onclick = function() {
	window.location.href = "${pageContext.request.contextPath}/home/home";
}
</script>
</html>