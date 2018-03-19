<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>我的卡券</title>
		<link rel="stylesheet" href="<%=basePath%>/css/bootstrap.min.css" />
		<link rel="stylesheet" href="<%=basePath%>/css/sd_home.css" />
		<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
		<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

		<script type="text/javascript">
			$(document).ready(function() {
				$("#youxiao").click(function() {
					$("#youxiaos").toggle(400);
				});
				$("#yishiyong").click(function() {
					$("#yishiyongs").toggle(400);
				});
			})
		</script>
	</head>

	<body>
		<div class="hidden-lg hidden-md" style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
			<form role="form">
				<div style="text-align: center;">
					<br /> <br /> <br /> <br /> <img src="<%=basePath%>/img/151851335876919.png" style="width: 60%;" />
				</div>
				<br /> <br /> <br /> <br />

				<div id="youxiao" class="form-group" style="height: 60px; border: groove; border-radius: 5px;">
					<div style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						有效卡券>></div>
				</div>
				<div id="youxiaos">

					<c:forEach items="${couponsInfos}" var="couponsInfo">
						<div class="form-group" style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove;">
							<div style="position: relative; height: 60px; width: 100%; background-color:; font-size: 40px;">
								闪电校园旗下>></div>
							<div class="col-xs-3" style="background-color:; height: 300px; text-align: center;">
								<br /> <img src="${couponsInfo.getImageSrc()}" style="width: 80%; height: 80%;" />
							</div>
							<div class="col-xs-9" style="background-color:; height: 300px; border:; border-radius: 25px;">
								<br />
								<div class="col-xs-9" style="text-align: left;">
									<p style="font-size: 50px; font-family: '楷体'; color: brown;">${couponsInfo.getName()}</p>
									<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--${couponsInfo.getDescription()}</p>
									<p style="font-size: 35px;">${couponsInfo.getCreatTime()}-${couponsInfo.getEndTime()}</p>

								</div>
								<div class="col-xs-3" style="background-color:; text-align: right;">
									<!-- <br /> <span style="font-size: xx-large">X1</span> --><br /> <br />
									<br /> <span style="text-decoration: line-through; font-size: xx-large;">${couponsInfo.getMinMoney()}</span>
									<span style="font-size: -webkit-xxx-large; color: red;"><b>${couponsInfo.getMoney()}</b></span>
								</div>

							</div>
							<div style="display: none;">
								<input name="kaquanid" type="text" value="${couponsInfo.getId() }" />
							</div>
						</div>
					</c:forEach>

				</div>

				<div id="yishiyong" class="form-group" style="height: 60px; border: groove; border-radius: 5px;">
					<div style="position: relative; height: 60px; width: 100%; background-color: violet; font-size: 40px;">
						未拥有卡券>></div>
				</div>
				<div id="yishiyongs" style="display: none;">
					<c:forEach items="${couponsInfos_unavailable}" var="couponsInfo1">
						<div class="form-group" style="position: relative; height: 355px; width: 100%; overflow: hidden; border: groove; ">
							<div style="position: relative; height: 60px; width: 100%; background-color:; font-size: 40px;">
								闪电校园旗下>></div>
							<div class="col-xs-3" style="background-color:; height: 300px; text-align: center;">
								<br /> <img src="${couponsInfo1.getImageSrc()}" style="width: 80%; height: 80%;" />
							</div>
							<div class="col-xs-9" style="background-color:; height: 300px; border:; border-radius: 25px;">
								<br />
								<div class="col-xs-9" style="text-align: left;">
									<p style="font-size: 50px; font-family: '楷体'; color: brown;">${couponsInfo1.getName()}</p>
									<p style="font-size: 35px; font-family: '宋体';">&nbsp;&nbsp;&nbsp;--${couponsInfo1.getDescription()}</p>
									<p style="font-size: 35px;">${couponsInfo1.creatTime()}-${couponsInfo1.getEndTime()}</p>
								</div>
								<div class="col-xs-3" style="background-color:; text-align: right;">
									<!-- <br /> <span style="font-size: xx-large">X10</span> --><br /> <br />
									<br /> <span style="text-decoration: line-through; font-size: xx-large;">${couponsInfo1.getMinMoney()}</span>
									<span style="font-size: -webkit-xxx-large; color: red;"><b>${couponsInfo1.getMoney()}</b></span>
								</div>
							</div>
							<div style="display: none;">
								<input name="kaquanid" type="text" value="${	couponsInfo1.getId() }" />
							</div>
						</div>
					</c:forEach>

				</div>

			</form>
		</div>
	</body>

</html>