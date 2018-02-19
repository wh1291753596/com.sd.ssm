<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>轮播图片</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<link rel="stylesheet" href="../css/common.css" />
<link rel="stylesheet" href="../css/index.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/imgUp.js"></script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div style="text-align: center;">
				<br /> <br /> <br /> <br /> <img src="../img/151896360260545.png"
					style="width: 60%;" />
			</div>
			<div class="img-box full">

				<p style="font-size: 50px;">最多添加8张照片</p>
				<div class="z_photo upimg-div clear">

					<section class="z_file fl"> <img src="../img/a11.png"
						class="add-img"> <input type="file" name="file" id="file"
						class="file" value=""
						accept="image/jpg,image/jpeg,image/png,image/bmp" multiple /> </section>
				</div>

			</div>
			<aside class="mask works-mask">
			<div class="mask-content">
				<p class="del-p ">您确定要删除作品图片吗？</p>
				<p class="check-p">
					<span class="del-com wsdel-ok">确定</span><span class="wsdel-no">取消</span>
				</p>
			</div>
			</aside>
			<br /> <br /> <br />
			<button type="submit" class="btn btn-success  btn-block"
				style="height: 80px;">
				<h2>提交</h2>
			</button>
			<br /> <br /> <br /> <br />
		</form>
	</div>
</body>
</html>