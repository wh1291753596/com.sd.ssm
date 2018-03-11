<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传寄件表格</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
.file {
	position: relative;
	display: inline-block;
	background: #D0EEFF;
	border: 1px solid #99D3F5;
	border-radius: 4px;
	padding: 4px 12px;
	overflow: hidden;
	color: #1E88C7;
	text-decoration: none;
	text-indent: 0;
	line-height: 100px;
	width:300px;
	text-align: center;
}

.file input {
	position: absolute;
	font-size: 150px;
	right: 0;
	top: 0;
	opacity: 0;
}

.file:hover {
	background: #AADFFD;
	border-color: #78C3F3;
	color: #004974;
	text-decoration: none;
}
</style>
<script type="text/javascript" src="../js/xlsx.full.min.js"></script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque; height: 100%;">
		<div
			style="height: 100px; width: 100%; background-color: blueviolet; text-align: left;">
			<br />
			<div id="return">
				<img src="../img/返回.png" style="height: 70px;" />
			</div>
		</div>
		<div style="text-align: center;">
			<br> <br> <br>
			<button style="width: 300px; height: 100px; font-size: 50px;" id="dd"
				class="btn btn-primary" onclick="downloadExl(jsono)">下载表格</button>
			<div style="font-size: 40px;">
				<!--下面a标签主要用于创建超级链接提供下载 资源 -->
				<a href="" download="快递价格填写表格.xlsx" id="hf"></a> <br> <br>
				
					<label class="form-label">填写文件</label> <a href="" class="file">选择文件
						<input type="file" name="" id=""  accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"  
							onchange="importf(this)">
					</a>
					<div id="demo"
						style="font-size: 50px; border: 1px solid red; text-align: center;"></div>
						<br>
					<input type="submit" value="上传寄件价格" id="sendJson">
				
			</div>
		</div>

		<!-- 该js文件主要用于加载xlms -->
		<script>
			var wb; //读取完成的数据
			var rABS = false; //是否将文件读取为二进制字符串		
			var jsonStr;
			function importf(obj) { //导入
				if (!obj.files) {
					return;
				}
				var f = obj.files[0];
				var reader = new FileReader();
				reader.onload = function(e) {
					var data = e.target.result;
					if (rABS) {
						wb = XLSX.read(btoa(fixdata(data)), { //手动转化
							type : 'base64'
						});
					} else {
						wb = XLSX.read(data, {
							type : 'binary'
						});
					}
					//wb.SheetNames[0]是获取Sheets中第一个Sheet的名字
					//wb.Sheets[Sheet名]获取第一个Sheet的数据
					document.getElementById("demo").innerHTML = (XLSX.utils
							.sheet_to_html(wb.Sheets[wb.SheetNames[0]]));
					jsonStr=XLSX.utils
							.sheet_to_json(wb.Sheets[wb.SheetNames[0]]);
							jsonStr=JSON.stringify(jsonStr);
							
				};
				if (rABS) {
					reader.readAsArrayBuffer(f);
				} else {
					reader.readAsBinaryString(f);
				}
			}
			document.getElementById("sendJson").onclick=function(){
				 window.location.href=("consign.jsp?"+jsonStr);
				 			};
			
			function fixdata(data) { //文件流转BinaryString
				var o = "", l = 0, w = 10240;
				for (; l < data.byteLength / w; ++l)
					o += String.fromCharCode.apply(null, new Uint8Array(data
							.slice(l * w, l * w + w)));
				o += String.fromCharCode.apply(null, new Uint8Array(data
						.slice(l * w)));
				return o;
			}
		</script>
	</div>
</body>
<script src="../js/Good_DownExcle.js"></script>
</html>