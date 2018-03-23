package com.sd.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sd.bean.Attribute;
import com.sd.bean.Good;
import com.sd.bean.Image;
import com.sd.dao.AttributeMapper;
import com.sd.dao.GoodMapper;
import com.sd.dao.ImageMapper;
import com.sd.dao.SendMapper;
import com.sd.pojos.GoodsAttributeInfo;
import com.sd.service.IGoodsAttributeService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.GoodsAttribute;
import com.sd.util.cookies;

@Controller
@RequestMapping(value = "/books", method = RequestMethod.POST)
public class M_books_publish {
	@RequestMapping("/up")
	public String booksup(HttpServletRequest request) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		com.sd.bean.Image image2=new com.sd.bean.Image();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String name = request.getParameter("name");
			String stock = request.getParameter("stock");// 库存
			String author = request.getParameter("author");
			String press = request.getParameter("press");// 出版社
			String moneyPast = request.getParameter("money_past");// 商品原价
			String moneyNow = request.getParameter("money_now");// 现在价格
			Byte type = 31;// 类型
			Byte flag = 1;// 是否有效
			Short exit = Short.valueOf(stock).shortValue();
			BigDecimal price = new BigDecimal(moneyNow);
			BigDecimal price_past = new BigDecimal(moneyPast);
			Date now = new Date();
			
		

			
			
			
			
			
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
							image2.setCreateTime(now);
							image2.setPath(path);
							image2.setWidth(Short.valueOf(image2.getWidth().toString()));
							image2.setHeight(Short.valueOf(image2.getHeight().toString()));
							image2.setName(fileName);
							image2.setUpdateTime(now);
						}
					} catch (Exception e) {

					}
				}
			}
			
		
			
			
			SqlSession session = SqlSessionTool.CreateSqlSession();
			ImageMapper imageMapper=session.getMapper(ImageMapper.class);
			
			GoodMapper goodMapper=session.getMapper(GoodMapper.class);
			Good good = new Good();
			good.setName(name);
			good.setStock(exit);
			good.setUnit("本");
			good.setSalesQuantity(0);
			good.setShopPrice(price);
			good.setMarketPrice(price_past);
			good.setPulishTime(now);
			good.setType(type);
			good.setFlag(flag);
			good.setCreateTime(now);
			good.setImageId(imageMapper.selectByCreatTime(now).getId());
			goodMapper.insertSelective(good);
			session.commit();
			
			Good good2= goodMapper.selectByTime(now);
			GoodsAttributeInfo gAttributeInfo=new GoodsAttributeInfo();
			gAttributeInfo.setGoodsId(good2.getId());
			gAttributeInfo.setCreateTime(now);
			gAttributeInfo.setValue(press);
			gAttributeInfo.setAttributeId(1);
			IGoodsAttributeService goodsAttributeService=new GoodsAttribute();
			goodsAttributeService.insertRecord(gAttributeInfo);
			session.commit();
			
			gAttributeInfo.setAttributeId(2);
			gAttributeInfo.setValue(author);
			goodsAttributeService.insertRecord(gAttributeInfo);
			session.commit();
			imageMapper.insertSelective(image2);
		
			session.commit();
			session.close();
			
		
			return "successful";
		}
	}
}
