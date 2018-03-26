package com.sd.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sd.bean.Address;
import com.sd.bean.Coupon;
import com.sd.bean.Good;
import com.sd.bean.GoodAttributeInfo;
import com.sd.bean.Image;
import com.sd.dao.CouponMapper;
import com.sd.dao.GoodMapper;
import com.sd.dao.ImageMapper;
import com.sd.dao.SendMapper;
import com.sd.pojos.CouponsInfo;
import com.sd.pojos.GoodAttributeBooksInfo;
import com.sd.pojos.GoodAttributePojo;
import com.sd.pojos.GoodsAttributeInfo;
import com.sd.service.IAddressService;
import com.sd.service.IGoodAttributeInfoService;
import com.sd.service.IGoodsAttributeService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.AddressService;
import com.sd.service.imp.GoodAttributeInfoService;
import com.sd.service.imp.GoodsAttribute;
import com.sd.util.ConvertInfo;
import com.sd.util.FinduserId;
import com.sd.util.cookies;
/*
 * Author:WangHao
 * Time:2018/03/24
 * 图书、卡券购买渲染页面
 */
@Controller
@RequestMapping("/Oreder_Purchase")
public class Oreder_Purchase {

	@RequestMapping("/books")
	public String books(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);// 获取userid

			IAddressService addressService = new AddressService();
			// 获取默认地址
			Address defaultAddress = new Address();
			defaultAddress = addressService.GetdefaultAddressByUserId(getuserid);
			List<Address> defaultaddress = new ArrayList<Address>();
			defaultaddress.add(defaultAddress);
			if (defaultAddress == null) {
				return "addAddress";
			} else {
				model.addAttribute("defaultAddress", defaultaddress);// 默认地址
				
				String goodid = request.getParameter("goodid");
				Integer id = Integer.valueOf(goodid);

				IGoodAttributeInfoService goodAttributeInfoService = new GoodAttributeInfoService();
				List<GoodAttributeInfo> attributeInfos = new ArrayList<GoodAttributeInfo>();
				attributeInfos = goodAttributeInfoService.selectByGoodid(id);
				List<GoodAttributeBooksInfo> bGoodAttributeBooksInfos = new ArrayList<GoodAttributeBooksInfo>();
				ConvertInfo convertInfo = new ConvertInfo();
				bGoodAttributeBooksInfos = convertInfo.convert(attributeInfos);
				List<GoodAttributePojo> goodAttributePojos = new ArrayList<>();
				for (GoodAttributeBooksInfo dAttributeBooksInfo : bGoodAttributeBooksInfos) {
					GoodAttributePojo goodAttributePojo = new GoodAttributePojo();
					goodAttributePojo.setAuthor(dAttributeBooksInfo.getAuthor());
					goodAttributePojo.setImgSrc(getImageSrc(dAttributeBooksInfo.getImageId()));
					goodAttributePojo.setShopPrice(dAttributeBooksInfo.getShopPrice());
					goodAttributePojo.setDiscountPrice(dAttributeBooksInfo.getDiscountPrice());
					goodAttributePojo.setStock(dAttributeBooksInfo.getStock());
					goodAttributePojo.setDetail(dAttributeBooksInfo.getDetail());
					goodAttributePojo.setCompany(dAttributeBooksInfo.getPubcompany());
					goodAttributePojo.setName(dAttributeBooksInfo.getName());
					goodAttributePojo.setid(dAttributeBooksInfo.getid());
					goodAttributePojos.add(goodAttributePojo);
				}
				model.addAttribute("goodAttributePojos", goodAttributePojos);
				System.out.println("good=" + goodid);
				return "order_Purchase";
			}

		}
	}

	@RequestMapping("/tickets")
	public String tickets(HttpServletRequest request, Model model) {
		Boolean judgelogin = null;
		cookies uCookies = new cookies();
		judgelogin = uCookies.judge(request);
		if (judgelogin.equals(false)) {
			return "login";
		} else {
			String getusername = null;
			Integer getuserid = null;
			getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			getuserid = finduserId.getuserid(getusername);// 获取userid

			IAddressService addressService = new AddressService();
			// 获取默认地址
			Address defaultAddress = new Address();
			defaultAddress = addressService.GetdefaultAddressByUserId(getuserid);
			List<Address> defaultaddress = new ArrayList<Address>();
			defaultaddress.add(defaultAddress);
			if (defaultAddress == null) {
				return "addAddress";
			} else {
				model.addAttribute("defaultAddress", defaultaddress);// 默认地址
				
				String m=request.getParameter("m");
				SqlSession session = SqlSessionTool.CreateSqlSession();
				CouponMapper couponMapper=session.getMapper(CouponMapper.class);
				Coupon coupon=new Coupon();
				if (m.equals("31")) {
					coupon=couponMapper.selectByPrimaryKey(1);
				}
				else {
					coupon=couponMapper.selectByPrimaryKey(3);
				}
				List<Coupon> coupons=new ArrayList<Coupon>();
				coupons.add(coupon);
				List<CouponsInfo> oCouponsInfos=new ArrayList<CouponsInfo>();
				Date now=new Date();
				Date furture=new Date();//一个月后的时间
				Calendar calendar=new GregorianCalendar();
				calendar.setTime(now);
				calendar.add(calendar.MONTH, 1);
				furture=calendar.getTime();//一个月后的时间
				for(Coupon aCoupon:coupons)
				{
					CouponsInfo oCouponsInfo=new CouponsInfo();
					oCouponsInfo.setName(aCoupon.getName());
					oCouponsInfo.setImageSrc(getImageSrc(aCoupon.getImageId()));
					oCouponsInfo.setId(aCoupon.getId());
					oCouponsInfo.setDescription(aCoupon.getDescription());
					oCouponsInfo.setMoney(aCoupon.getMoney());	
					oCouponsInfo.setCreatTime(now);
					oCouponsInfo.setEndTime(furture);
					oCouponsInfos.add(oCouponsInfo);
					
				}
				model.addAttribute("oCouponsInfos", oCouponsInfos);
				return "Ticket_Purchase";
			}
			
		}
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
