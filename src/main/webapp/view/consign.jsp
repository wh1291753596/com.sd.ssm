<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>代寄快递</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#getprice").click(function() {
			$("#price").toggle(500);
		});
	});
</script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form"
			action="${pageContext.request.contextPath}/consign/up" method="post">

			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img
					src="../img/151818501140373.png" style="width: 60%;" />
			</div>
			<br /> <br />
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						填写说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;由填写信息错误造成的无法取货，本平台不承担任何责任，请大家一定填写仔细！！！</h2>

				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						取件时间：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;于前日18.00-当日11.30下单，将于当日12.30-13.30上门拿件<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;于11.30-18.00下单，将于当晚18.30-19.30上门拿件
				</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						寄件说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+快递每不足1Kg的按照1Kg收取</h2>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+非合作快递收费为：</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						寄件价目表：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+
					<button id="getprice" type="button" class="btn btn-info"
						style="height: 50px; font-size: x-large;">点我获取</button>
				</h2>
			</div>

			<div id="price" class="form-group" style="display: none;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						价目 说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+以下为首重+续重方式</h2>
				<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;以下为首重+续重方式</h3>
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						快递公司&nbsp;*：<br>
					</h1></label> <select class="form-control" name="peoplecompany"
					style="height: 50px; font-size: x-large; width: 100%">
					<option>中通</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						收件人姓名&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					name="peoplename" placeholder="请输入收件人姓名"
					style="height: 50px; width: 100%; font-size: x-large;">
			</div>
			<%-- <div>
			12345
			<c:forEach items="${mytest}" var="list">
				<p>${list.name}</p>
				<p>${list.phone}</p>
				<p>${list.detail}</p>
			</c:forEach>
			
			
			</div> --%>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						收件人电话&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					name="peoplephone" placeholder="请输入收件人电话"
					style="height: 50px; width: 100%; font-size: x-large;">
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						收件人地址&nbsp;：<br>
					</h1></label>
				<textarea class="form-control" rows="3" placeholder="请输入收件人地址"
					name="peopleaddress" style="font-size: x-large; width: 100%;"></textarea>
			</div>

			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						备注&nbsp;：<br>
					</h1></label>
				<textarea class="form-control" rows="2" placeholder="请输入备注(可选)"
					name="peopleinfo" style="font-size: x-large; width: 100%;"></textarea>
			</div>
			<br /> <br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px; width: 100%;">
				<h2>提交</h2>
			</button>
			<br /> <br /> <br />
		</form>

	</div>
</body>
</html>