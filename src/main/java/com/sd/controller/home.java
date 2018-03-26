package com.sd.controller;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.GoodAttributeInfo;
import com.sd.bean.Image;
import com.sd.bean.Parttimejob;
import com.sd.dao.ImageMapper;
import com.sd.pojos.GoodAttributeBooksInfo;
import com.sd.pojos.GoodAttributePojo;
import com.sd.service.IGoodAttributeInfoService;
import com.sd.service.IparttimejobService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.GoodAttributeInfoService;
import com.sd.service.imp.ParttimejobService;
import com.sd.util.ConvertInfo;
import com.sd.util.cookies;

@Controller
@RequestMapping("/home")
public class home {

	@RequestMapping("/home")
	public String testhome(HttpServletRequest request, Model model) {
		
		SqlSession session = SqlSessionTool.CreateSqlSession();
		ImageMapper imageMapper = session.getMapper(ImageMapper.class);
		IparttimejobService pIparttimejobService = new ParttimejobService();
		List<Parttimejob> parttimejobs = new ArrayList<Parttimejob>();
		parttimejobs = pIparttimejobService.select();
		for (Parttimejob iParttimejob : parttimejobs) {
			System.out.println(iParttimejob.getName());
		}
		model.addAttribute("parttimejob", parttimejobs);
		
		IGoodAttributeInfoService goodAttributeInfoService=new GoodAttributeInfoService();
		List<GoodAttributeInfo> goodAttributeInfos=goodAttributeInfoService.selectAll();	
		ConvertInfo convertInfo=new ConvertInfo();
		List<GoodAttributePojo>goodAttributePojos=new ArrayList<>();			
		List<GoodAttributeBooksInfo> goodAttributeBooksInfos=convertInfo.convert(goodAttributeInfos);
		
		for(GoodAttributeBooksInfo aBooksInfo:goodAttributeBooksInfos) {
			//为了不在构建新的pojo映射
			//直接新建LIST图片地址类与GoodAttributeBooksInfo相对应
			GoodAttributePojo goodAttributePojo=new GoodAttributePojo();
			goodAttributePojo.setAuthor(aBooksInfo.getAuthor());
			goodAttributePojo.setImgSrc(getImageSrc(aBooksInfo.getImageId()));
			goodAttributePojo.setShopPrice(aBooksInfo.getShopPrice());
			goodAttributePojo.setDiscountPrice(aBooksInfo.getDiscountPrice());
			goodAttributePojo.setStock(aBooksInfo.getStock());
			goodAttributePojo.setDetail(aBooksInfo.getDetail());
			goodAttributePojo.setCompany(aBooksInfo.getPubcompany());
			goodAttributePojo.setName(aBooksInfo.getName());
			goodAttributePojo.setid(aBooksInfo.getid());
			goodAttributePojos.add(goodAttributePojo);
			
		}		
		model.addAttribute("goodAttributePojos", goodAttributePojos);
	//	Image image=imageMapper.
		return "home";
	}

	@RequestMapping("/sds")
	public String sds(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		if (tableid.equals("0")) {
			Boolean judgelogin = null;
			cookies uCookies = new cookies();
			judgelogin = uCookies.judge(request);
			if (judgelogin.equals(false)) {
				return "login";
			} else {
				return "fetch";
			}
		} else {
			Boolean judgelogin = null;
			cookies uCookies = new cookies();
			judgelogin = uCookies.judge(request);
			if (judgelogin.equals(false)) {
				return "login";
			} else {
				return "consign";
			}
		}

	}

	@RequestMapping("/works")
	public String works(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		return "home";
	}

	@RequestMapping("/tushus")
	public String tushus(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		String goodid=request.getParameter("goodid");
		System.out.println("good="+goodid);
		return "order_Purchase";
	}

	@RequestMapping("/fulis")
	public String fulis(HttpServletRequest request, Model model) {
		String tableid = request.getParameter("m");
		System.out.println(tableid);
		return "order_Purchase";
	}
	
	
	public String getImageSrc(Integer imageId) {

		Reader reader;
		try {
			reader = Resources.getResourceAsReader("mybatisConfig.xml");
			// 创建
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader);
			SqlSession session = factory.openSession();
			// 尚不确定图片结果
			ImageMapper imageMapper = session.getMapper(ImageMapper.class);

			Image image = imageMapper.selectByPrimaryKey(imageId);
			return image.getPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "../img/会员.png";
		}

	}
}
