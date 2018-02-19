<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息发布</title>
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
				<br /> <br /> <br /> <br /> <img src="../img/151885834635089.png"
					style="width: 60%;" />
			</div>
			<br /> <br />
			<div class="form-group">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						兼职地点/书籍名字/卡券名字：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="10个字以内" style="height: 50px; font-size: x-large;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						兼职内容/书籍出版社/卡券归属：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="24个字以内" style="height: 50px; font-size: x-large;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						兼职工资，结款方式/作者/卡券作用：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="14个字以内" style="height: 50px; font-size: x-large;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						类型：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="14个字以内" style="height: 50px; font-size: x-large;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						数量：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="3个字以内" style="height: 50px; font-size: x-large;">
				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						价格：<br>
					</h1></label> <input type="text" class="form-control" id="firstname"
					placeholder="两位小数不能过百" style="height: 50px; font-size: x-large;">

				<label class="alert-warning"
					style="text-align: left; background-color: bisque;"><h1>
						添加图片：<br>
					</h1></label> <input type="file" /> <label class="alert-success"
					style="text-align: left; background-color: bisque;"><h1>
						上架区域&nbsp;*：<br>
					</h1></label>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="TYPE" type="radio" value=""
						style="height: 30px; width: 30px;" />书籍</label>
				</h2>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="TYPE" type="radio" value=""
						style="height: 30px; width: 30px;" />福利</label>
				</h2>
				<h2>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input
						name="TYPE" type="radio" value=""
						style="height: 30px; width: 30px;" />兼职</label>
				</h2>
			</div>
			<br /> <br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>提交</h2>
			</button>
			<br /> <br /> <br />
		</form>
	</div>
</body>
</html>