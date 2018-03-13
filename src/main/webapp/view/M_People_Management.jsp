<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人员权限分配</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

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

		$('input[name="selectDaiJiall"]').click(function() {
			//alert(this.checked);  
			if ($(this).is(':checked')) {
				$('input[name="stuDaiJiCheckBox"]').each(function() {
					//此处如果用attr，会出现第三次失效的情况  
					$(this).prop("checked", true);
				});
			} else {
				$('input[name="stuDaiJiCheckBox"]').each(function() {
					$(this).removeAttr("checked", false);
				});
				//$(this).removeAttr("checked");  
			}
		});
	});
</script>
</head>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%;">
		<form role="form">
			<button type="button" class="btn btn-primary" data-toggle="modal"
				data-target="#add"
				style="width: 200px; height: 60px; font-size: 38px;">新增</button>
			<button type="button" class="btn btn-success" data-toggle="modal"
				data-target="#edit"
				style="width: 200px; height: 60px; font-size: 38px;">编辑</button>
			<button type="button" class="btn btn-danger"
				style="width: 200px; height: 60px; font-size: 38px;">删除</button>

			<table
				class="table table-hover table-bordered table-responsive table-condensed">
				<thead>
					<tr style="font-size: xx-large;">
						<th><input type="checkbox" name="selectDaiJiall"
							style="width: 20px; height: 20px;" /></th>
						<th>姓名</th>
						<th>电话</th>
						<th>账号(最好用qq号)</th>
						<th>密码</th>
						<th>角色</th>
						<th>寝室</th>
					</tr>
				</thead>
				<tbody>
					<tr style="font-size: x-large;">
						<th><input type="checkbox" name="stuDaiJiCheckBox"
							style="width: 20px; height: 20px;" /></th>
						<td>007</td>
						<td>18168749587</td>
						<td>6598742</td>
						<td>123</td>
						<td>1</td>
						<td>4-3-206</td>
					</tr>
					<tr style="font-size: x-large;">
						<th><input type="checkbox" name="stuDaiJiCheckBox"
							style="width: 20px; height: 20px;" /></th>
						<td>007</td>
						<td>18168749587</td>
						<td>6598742</td>
						<td>123</td>
						<td>1</td>
						<td>4-3-206</td>
					</tr>
				</tbody>
			</table>
			<div class="modal fade" id="add" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h1 class="modal-title" id="myModalLabel">新增角色</h1>
						</div>
						<div class="modal-body">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									姓名&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入姓名" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									电话&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入电话" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									寝室号&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入寝室号" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									账号&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入账号" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									密码&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入密码" style="height: 50px; font-size: x-large;">
							<label class="alert-success" style="text-align: left;"><h1>
									角色&nbsp;*：<br>
								</h1></label> <select class="form-control"
								style="height: 50px; font-size: x-large;">
								<option>1</option>
								<option>2</option>
								<option>3</option>
							</select>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal"
								style="width: 100px; height: 50px; font-size: 30px;">关闭</button>
							<button type="button" class="btn btn-primary"
								style="width: 100px; height: 50px; font-size: 30px;">提交</button>
						</div>
					</div>
				</div>
			</div>
			<div class="modal fade" id="edit" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h1 class="modal-title" id="myModalLabel">新增角色</h1>
						</div>
						<div class="modal-body">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									姓名&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入姓名" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									电话&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入电话" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									寝室号&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入寝室号" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									账号&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入账号" style="height: 50px; font-size: x-large;">
							<label class="alert-success"
								style="text-align: left; background-color: white"><h2>
									密码&nbsp;*：<br>
								</h2></label> <input type="text" class="form-control" id="firstname"
								placeholder="请输入密码" style="height: 50px; font-size: x-large;">
							<label class="alert-success" style="text-align: left;"><h1>
									角色&nbsp;*：<br>
								</h1></label> <select class="form-control"
								style="height: 50px; font-size: x-large;">
								<option>1</option>
								<option>2</option>
								<option>3</option>

							</select>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal"
								style="width: 100px; height: 50px; font-size: 30px;">关闭</button>
							<button type="button" class="btn btn-primary"
								style="width: 100px; height: 50px; font-size: 30px;">提交</button>
						</div>
					</div>
				</div>

			</div>
		</form>
	</div>
</body>
</html>