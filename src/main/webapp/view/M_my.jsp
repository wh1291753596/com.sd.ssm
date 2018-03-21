<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理后台功能</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.header {
	font-size: 50px;
	font-family: '黑体';
	border-bottom: solid 2px #E7E7EB;
}

.arrow {
	float: right;
	font-size: 50px;
	color: #f2f2f2;
	margin-top: 10px;
}

.menu {
	background-color: white;
	top: 20%;
	padding-left: 5%;
	padding-right: 5%;
	position: absolute;
	width: 100%;
}

.no-border {
	border: hidden;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
		style="height:300px;background-color: #F2F2F3;border: hidden;">
	<!--navbar-inverse 表示带反色（黑色背景，白色文字）的导航栏，navbar-fixed-top 表示 一直停留在顶部  添加 role="navigation"，有助于增加可访问性-->
	<div id="photostyle">
		<img src="../img/闪电速代灰色.jpg" class="img-responsive" alt="SdCampus"
			style="height: 300px;">
	</div>
	</nav>
	<!--菜单栏-->
	<div class="menu">
		<div>
			<p class="page-header header">
				快递代取<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div>
			<p class="page-header header">
				快递代寄<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div>
			<p class="page-header header">
				快递跑腿<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div>
			<p class="page-header header">
				兼职发布<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div>
			<p class="page-header header">
				卡券发布<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div>
			<p class="page-header header">
				图书上架<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
		<div id="peoplemanage">
			<p class="page-header header">
				后台人员管理<span class="glyphicon glyphicon glyphicon-menu-right arrow"></span>
			</p>
		</div>
	</div>

</body>
<script type="text/javascript">
var peoplemanage = document.getElementById("peoplemanage");
peoplemanage.onclick = function() {
	window.location.href = "${pageContext.request.contextPath}/MPeopleManage/queryuser";
}
</script>
</html>