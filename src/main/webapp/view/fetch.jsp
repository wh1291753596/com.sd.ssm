<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>代取快递</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#show").click(function() {
			$("#UrgentTime").show(500);
		});
		$("#hide").click(function() {
			$("#UrgentTime").hide(500);
		});
	});
</script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img src="../img/151818492711346.png"
					style="width: 60%;" />
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
						价目表：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;中小件：1.9元<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大件：2.9-10元(据实际情况而定)
				</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						常规送件时间：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;于前日19.00-当日11.10下单，将于当日12.00-14.00送达<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;于11.10-18.30下单，将于当晚送达
				</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						小件说明：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+长度不超过30cm，以及重量小于1Kg的物品均为小件<br />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+通俗来说，快件的重量以及大小均比鞋盒轻及小的为小件
				</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						中件说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+长度不超过50cm，以及重量小于2Kg的物品均为中件</h2>
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						大件说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+超过中件规格的为大件</h2>
				\ <label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						加急说明：<br>
					</h1></label>
				<h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+XXXXXXXXXXXXXX</h2>
				\
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						快递公司&nbsp;*：<br>
					</h1></label> <select class="form-control"
					style="height: 50px; font-size: x-large;">
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
						取货码&nbsp;*：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="请输入取货码" style="height: 50px; font-size: x-large;">
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						快递类型&nbsp;*：<br>
					</h1></label> <select class="form-control"
					style="height: 50px; font-size: x-large;">
					<option>大件物品</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
				</select>
			</div>
			<div id="urgent" class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						是否加急&nbsp;*：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						id="show" name="judge" type="radio" value=""
						style="height: 30px; width: 30px;" />是</label>
				</h2>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						id="hide" name="judge" type="radio" value=""
						style="height: 30px; width: 30px;" checked />否</label>
				</h2>
			</div>
			<div id="UrgentTime" class="form-group" style="display: none;">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						加急时间&nbsp;*：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="time" type="radio" value=""
						style="height: 30px; width: 30px;" />半小时内</label>
				</h2>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="time" type="radio" value=""
						style="height: 30px; width: 30px;" />1小时内</label>
				</h2>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="time" type="radio" value=""
						style="height: 30px; width: 30px;" />2小时内</label>
				</h2>
			</div>
			<div class="form-group">
				<label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						备注&nbsp;：<br>
					</h1></label>
				<textarea class="form-control" rows="2" placeholder="请输入备注(可选)"
					style="font-size: x-large;"></textarea>
			</div>
			<br /> <br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>提交</h2>
			</button>
			<br /> <br /> <br /> <br /> <br /> <br />
		</form>

	</div>
</body>
</html>