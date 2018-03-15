<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理端表单</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/jquery.table2excel.js"></script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$("#btn").click(function() {
							$("#shuju").table2excel({
								exclude : ".noExl",
								name : "导出数据",
								filename : "导出数据",
								exclude_img : true,
								exclude_links : true,
								exclude_inputs : true
							});
						});

						$('input[name="selectall"]').click(function() {
							//alert(this.checked);  
							if ($(this).is(':checked')) {
								$('input[name="stuCheckBox"]').each(function() {
									//此处如果用attr，会出现第三次失效的情况  
									$(this).prop("checked", true);
								});
							} else {
								$('input[name="stuCheckBox"]').each(function() {
									$(this).removeAttr("checked", false);
								});
								//$(this).removeAttr("checked");  
							}

						});

						$('input[name="selectDaiJiall"]').click(
								function() {
									//alert(this.checked);  
									if ($(this).is(':checked')) {
										$('input[name="stuDaiJiCheckBox"]')
												.each(
														function() {
															//此处如果用attr，会出现第三次失效的情况  
															$(this).prop(
																	"checked",
																	true);
														});
									} else {
										$('input[name="stuDaiJiCheckBox"]')
												.each(
														function() {
															$(this).removeAttr(
																	"checked",
																	false);
														});
										//$(this).removeAttr("checked");  
									}

								});

						$('table td')
								.click(
										function() {
											if (!$(this).is('.input')) {
												$(this)
														.addClass('input')
														.html(
																'<input type="text" value="'
																		+ $(
																				this)
																				.text()
																		+ '" />')
														.find('input')
														.focus()
														.blur(
																function() {
																	$(this)
																			.parent()
																			.removeClass(
																					'input')
																			.html(
																					$(
																							this)
																							.val() || 0);
																});
											}
										}).hover(function() {
									$(this).addClass('hover');
								}, function() {
									$(this).removeClass('hover');
								});

					});
</script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img
					src="../img/151887360012587.png" style="width: 60%;" />
			</div>
			<br /> <br /> <br />
			<div class="form-group">
				<h2>
					<label for="name">选择列表</label> <select style="width: 200px;">
						<option>已下单</option>
						<option>取件中</option>
						<option>在派送</option>
						<option>未付款</option>
					</select>

				</h2>
			</div>

			<table id="shuju"
				class="table table-hover table-bordered table-responsive table-condensed"
				style="display: ;">
				<thead style="">
					<tr style="font-size: xx-large;">
						<th><input type="checkbox" name="selectall"
							style="width: 20px; height: 20px;" /></th>
						<th>公司</th>
						<th>取货码</th>
						<th>姓名</th>
						<th>电话</th>
						<th>地址</th>
						<th>时间</th>
						<th>备注</th>
						<th>价格</th>
					</tr>
				</thead>
				<tbody>

					<tr style="font-size: x-large;">
						<c:forEach items="${okok}" var="user">
							<th><input type="checkbox" name="stuCheckBox"
								style="width: 20px; height: 20px;" /></th>
							<td>${user.name}</td>
							<td>${user.shenfenzh }</td>
							<td>${user.address }</td>
							<td>18165584984</td>
							<td>2-2-314</td>
							<td>2018/2/17 22.39</td>
							<td>麻烦给我早点送过来，我要出去，谢谢</td>
							<td>1.9</td>
						</c:forEach>

					</tr>
					<tr style="font-size: x-large;">
						<th><input type="checkbox" name="stuCheckBox"
							style="width: 20px; height: 20px;" /></th>
						<td>中通</td>
						<td>126524</td>
						<td>王顺</td>
						<td>18165584984</td>
						<td>2-2-314</td>
						<td>2018/2/17 22.39</td>
						<td>麻烦给我早点送过来，我要出去，谢谢</td>
						<td>1.9</td>
					</tr>
				</tbody>
			</table>

			<table
				class="table table-hover table-bordered table-responsive table-condensed"
				style="display:none;">
				<thead style="">
					<tr style="font-size: xx-large;">
						<th><input type="checkbox" name="selectDaiJiall"
							style="width: 20px; height: 20px;" /></th>
						<th>公司</th>
						<th>寄件人</th>
						<th>电话</th>
						<th>地址</th>
						<th>收件人</th>
						<th>电话</th>
						<th>地址</th>
						<th>时间</th>
						<th>备注</th>
						<th>价格</th>
					</tr>
				</thead>
				<tbody>
					<tr style="font-size: x-large;">
						<th><input type="checkbox" name="stuDaiJiCheckBox"
							style="width: 20px; height: 20px;" /></th>
						<td>中通</td>
						<td>代号007</td>
						<td>18168749587</td>
						<td>2-5-354</td>
						<td>代号008</td>
						<td>19856745625</td>
						<td>成都市山东航空山东航空技术号开始计划考试看</td>
						<td>2018/2/17 22.39</td>
						<td>麻烦给我早点送过来，我要出去，谢谢</td>
						<td>10.9</td>
					</tr>
					<tr style="font-size: x-large;">
						<th><input type="checkbox" name="stuDaiJiCheckBox"
							style="width: 20px; height: 20px;" /></th>
						<td>中通</td>
						<td>代号007</td>
						<td>18168749587</td>
						<td>2-5-354</td>
						<td>代号008</td>
						<td>19856745625</td>
						<td>成都市山东航空山东航空技术号开始计划考试看</td>
						<td>2018/2/17 22.39</td>
						<td>麻烦给我早点送过来，我要出去，谢谢</td>
						<td>10.9</td>
					</tr>
				</tbody>
			</table>

			<div class="form-group">
				<h2>
					<label for="name">更新到：</label> <select style="width: 200px;">
						<option>取件中</option>
						<option>在派送</option>
						<option>未付款</option>
					</select>
					<button id="btn"
						style="border: double; border-radius: 10px; float: right;">导出数据</button>
				</h2>
			</div>
			<br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>确认提交</h2>
			</button>

		</form>
	</div>

</body>
</html>