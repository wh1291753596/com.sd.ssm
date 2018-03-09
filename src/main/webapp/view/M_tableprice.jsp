<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" />
<link rel="stylesheet" href="../css/sd_home.css" />
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/xlsx.full.min.js"></script>
</head>
<body>
	<div class="hidden-lg hidden-md"
		style="position: absolute; top: 0px; width: 100%; background-color: bisque;">
		<form role="form">
			<div
				style="height: 100px; width: 100%; background-color: blueviolet; text-align: left;">
				<br />
				<div id="return">
					<img src="../img/返回.png" style="height: 70px;" />
				</div>
			</div>
			<div style="text-align: center; font-size: 40px">
				<br> <br> <br>
				<button id="dd" onclick="downloadExl(jsono)">
					<h2>下载表单</h2>
				</button>
				<a href="" download="快递价格填写表格.xlsx" id="hf"></a> <br> <br>
				<label>请上传价格文件：</label> <input type="file" name="xlsx" id="xls"
					onchange="importf(this)" style="text-align: center;" />


			</div>
			<div id="demo"></div>
			<script>
				var wb; //读取完成的数据
				var rABS = false; //是否将文件读取为二进制字符串			
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

						document.getElementById("demo").innerHTML = JSON
								.stringify(XLSX.utils
										.sheet_to_json(wb.Sheets[wb.SheetNames[0]]));
					};
					if (rABS) {
						reader.readAsArrayBuffer(f);
					} else {
						reader.readAsBinaryString(f);
					}
				}

				function fixdata(data) { //文件流转BinaryString
					var o = "", l = 0, w = 10240;
					for (; l < data.byteLength / w; ++l)
						o += String.fromCharCode.apply(null, new Uint8Array(
								data.slice(l * w, l * w + w)));
					o += String.fromCharCode.apply(null, new Uint8Array(data
							.slice(l * w)));
					return o;
				}
			</script>


		</form>
	</div>
</body>
<script src="../js/Good_DownExcle.js"></script>
</html>