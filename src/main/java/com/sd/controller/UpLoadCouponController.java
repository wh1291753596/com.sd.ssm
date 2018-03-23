
package com.sd.controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sd.bean.Coupon;
import com.sd.dao.ImageMapper;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.CouponServiceClass;

/**
 * @author FCmmmmmm
 * Time:2018年3月16日 上午9:17:29
 */
@Controller
@RequestMapping(value="/Coupon",method = RequestMethod.POST)
public class UpLoadCouponController {
	@RequestMapping("/up")
	public String index(HttpServletRequest request, Model model, String name, String type, String description,
			String money) {

		/*
		 * 判断登录 获取信息 提取图片 构建类 储存
		 */
	
		String couponName = name;
		String couponDescriptiion = description;
		BigDecimal couponMoney = new BigDecimal(money);
		String couponType = type;
		com.sd.bean.Image image2=new com.sd.bean.Image();
		
		Date startTime=new Date();
		
		
		//图片处理机制
		if (request instanceof MultipartHttpServletRequest) {

			MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
			// 获得第1张图片（根据前台的name名称得到上传的文件）
			MultipartFile imgFile1 = multipartHttpServletRequest.getFile("firstImg");
			if (!imgFile1.isEmpty()) {
				// 获取前端传来的文件名
				String fileName = imgFile1.getOriginalFilename();
				String SQLBasePath = "img\\";
				// 拿到本地服务器会话位置---可以是绝对地址
				String realPath = request.getSession().getServletContext().getRealPath("/")  + SQLBasePath;
				Date date = new Date();
				// 自定义的文件名称---防止覆盖以前
				String trueFileName = date.getYear() + date.getMonth() + date.getDay() + date.getHours()
						+ date.getMinutes() + fileName;
				// 设置存放图片文件的路径
				String path = realPath + trueFileName;
				try {
					// 利用文件流保存文件
					imgFile1.transferTo(new File(path));
					InputStream is = new FileInputStream(path);
					BufferedImage image =  ImageIO.read(is);
					if(image!=null) {
						image2.setCreateTime(startTime);
						image2.setPath(path);
						image2.setWidth(Short.valueOf(image2.getWidth().toString()));
						image2.setHeight(Short.valueOf(image2.getHeight().toString()));
						image2.setName(fileName);
						image2.setUpdateTime(startTime);
					}
				} catch (Exception e) {

				}
			}
		}
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		ImageMapper imageMapper=session.getMapper(ImageMapper.class);
		Coupon coupon = new Coupon();
		coupon.setImageId(imageMapper.selectByCreatTime(startTime).getId());
		coupon.setMoney(couponMoney);
		coupon.setName(couponName);
		coupon.setDescription(couponDescriptiion);
		coupon.setEndTime(startTime);
		coupon.setType((byte) 2);
		coupon.setIssuedQuantity(15);
		coupon.setReceiveQuantity(15);
		coupon.setStartTime(startTime);
		coupon.setCreateTime(startTime);
		coupon.setFlag((byte) 1);
		coupon.setName("");
		 
		
		
		CouponServiceClass couponServiceClass=new CouponServiceClass();
		couponServiceClass.creatCoupon(image2, coupon);
		return "successful";

	}

}
