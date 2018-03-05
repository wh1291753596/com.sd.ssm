<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书发布</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="hidden-lg hidden-md" style="position: absolute;top: 0px;width: 100%; background-color: bisque;">
			<form role="form">
				<div style="height: 100px;width: 100%;background-color: blueviolet;text-align: left;">
					<br />
					<div id="return">
						<img src="../img/返回.png" style="height: 70px;" />
					</div>
				</div>
				<div class="form-group">
					<br />
					<br />
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>商品名称：<br></h1></label>
					<input type="text" class="form-control" id="name" name="name" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>商品库存：<br></h1></label>
					<input type="text" class="form-control" id="stock" name="stock" placeholder="10个字以内" style="height: 50px;font-size: x-large;">					
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>作者：<br></h1></label>
					<input type="text" class="form-control" id="author" name="author" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>出版社：<br></h1></label>
					<input type="text" class="form-control" id="press" name="press" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>商品原价：<br></h1></label>
					<input type="text" class="form-control" id="money_past" name="money_past" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>商品现价：<br></h1></label>
					<input type="text" class="form-control" id="money_now" name="money_now" placeholder="10个字以内" style="height: 50px;font-size: x-large;">
					<label class="alert-warning" style="text-align: left;background-color: bisque;"><h1>商品图片：<br></h1></label>
					<div style="padding: 20px">
						<input onchange="FirstImg()" name="firstImg" style="opacity:0;position:absolute" type="file" id="FirstfileImg" multiple="">
						<div position:absolute="">
							<p style="font-size: 30px;color: red;">选择图片</p>
						</div>
						<fieldset style="width:100%;">
							<legend style="font-size: 25px;">图片预览</legend>
							<div style="position: relative;" id="pictures">
							</div>
						</fieldset>
					</div>
					<br />
					<button type="submit" class="btn btn-success  btn-block" style="height: 80px;"><h2>确认提交</h2></button>
					<br />
					<br />
					
				</div>
			</form>
		</div>
</body>
<script>
		jQuery.DuoImgsYulan = function(file, id) {
			for(var i = 0; i < 5; i++) {
				//					判断是不是图片文件
				if(!/image\/\w+/.test(file[i].type)) {
					alert("请选择图片文件");
					return false;
				}
				//					判断图片是否大于2MB
				if(file[i].size > 2048 * 1024) {
					alert("图片不能大于2MB");
					continue;
				}
				var img;
				//					用来显示抓取图片环境
				//					console.log(document.getElementById("fileImg"));
				//					console.log(file[i]);
				//					console.log("file-size=" + file[i].size);
				//					开始读取流
				var reader = new FileReader();
				//					reader.onloadstart = function(e) {
				//						console.log("开始读取....");
				//					}
				//					reader.onprogress = function(e) {
				//						console.log("正在读取中....");
				//					}
				//					reader.onabort = function(e) {
				//						console.log("中断读取....");
				//					}
				//					reader.onerror = function(e) {
				//						console.log("读取异常....");
				//					}
				reader.onload = function(e) {
					console.log("成功读取....");
					var div = document.createElement("div"); //外层 div
					div.setAttribute("style", "position:relative;width:inherit;height:inherit;float:left;z-index:2;width:290px;margin-left:8px;margin-right:8px;");
					var del = document.createElement("div"); //删除按钮div
					del.setAttribute("style", "position: absolute; bottom: 4px; right: 0px; z-index: 99; width: 50px; height:50px;border-radius:50%;")
					//创建一个图片
					var delicon = document.createElement("img");
					//这是把删除的图标加在这个图片里面
					delicon.setAttribute("src", "http://www.jq22.com/tp/f26c324f-24db-4f08-91d6-f7ffc9ca1516.png");
					//这是删除文字
					delicon.setAttribute("title", "删除");
					//这是删除的图标的大小
					delicon.setAttribute("style", "cursor:pointer;width: 50px; height:50px");
					//删除事件
					del.onclick = function() {
						this.parentNode.parentNode.removeChild(this.parentElement);
						ClearfirtsImg();
					};
					//把这个图片添加到这个删除div里面
					del.appendChild(delicon);
					//把这个删除div添加到这个大的div里面
					div.appendChild(del);
					//再创建一个图片
					var imgs = document.createElement("img"); //上传的图片

					imgs.setAttribute("name", "loadimgs");
					imgs.setAttribute("src", e.target.result);
					imgs.setAttribute("width", 290);
					if(document.getElementById(id).childNodes.length > 4) {
						document.getElementById(id).removeChild(document.getElementById(id).firstChild);
					}
					//这个上传的图片在放在这个div里面
					div.appendChild(imgs)
					document.getElementById(id).appendChild(div);
				}
				reader.readAsDataURL(file[i]);
			}
		}
		//触发事件
		function FirstImg() {
			$.DuoImgsYulan(document.getElementById("FirstfileImg").files, "pictures");
		}

		//用来删除第一张照片
		function ClearfirtsImg() {
			var file = $("#FirstfileImg")
			file.after(file.clone().val(""));
			file.remove();
		}
	</script>

</html>