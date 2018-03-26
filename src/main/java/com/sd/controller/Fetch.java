package com.sd.controller;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sd.bean.Address;
import com.sd.bean.Get;
import com.sd.bean.Good;
import com.sd.bean.Order;
import com.sd.bean.OrderGood;
import com.sd.dao.GetMapper;
import com.sd.dao.OrderGoodMapper;
import com.sd.dao.OrderMapper;
import com.sd.service.IAddressService;
import com.sd.service.SqlSessionTool;
import com.sd.service.imp.AddressService;
import com.sd.util.FinduserId;
import com.sd.util.cookies;

/*
 * Author:WangHao
 * Time:2018/03/25
 * 代取快递上传
 */
@Controller
@RequestMapping(value = "/fetch", method = RequestMethod.POST)
public class Fetch {

	@RequestMapping("/add")
	public String add(HttpServletRequest request, Model model) {
		String company = request.getParameter("company");
		String pickcode = request.getParameter("pick_code");
		String remark = request.getParameter("remake");
		String type = request.getParameter("type");
		String urgent = request.getParameter("judge");
		if (urgent.equals("是")) {
			String urgenttime = request.getParameter("time");
			if (urgenttime.equals("30")) {
				urgenttime = "30";
			} else if (urgenttime.equals("60")) {
				urgenttime = "60";
			} else {
				urgenttime = "120";
			}
			// 加急送，插入到get表中
			SqlSession session = SqlSessionTool.CreateSqlSession();
			GetMapper getMapper = session.getMapper(GetMapper.class);
			Get getExpress = new Get();
			getExpress.setCompany(company);
			getExpress.setPickCode(pickcode);
			getExpress.setType(type);
			Byte mByte = 1;
			getExpress.setIsUrgent(mByte);
			getExpress.setUrgentTime(urgenttime);
			Date now = new Date();
			getExpress.setCreateTime(now);
			getMapper.insertSelective(getExpress);
			session.commit();
			Integer getid = getMapper.selectByTime(now).getId();// 获取getid
			// 获取userid
			cookies uCookies = new cookies();
			String getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			Integer getuserid = finduserId.getuserid(getusername);
			// 获取默认地址
			IAddressService addressService = new AddressService();
			Address defaultAddress = addressService.GetdefaultAddressByUserId(getuserid);
			// 插入到order表
			Order order = new Order();
			order.setUserId(getuserid);
			order.setOrderStatusId(1);
			order.setRemark(remark);
			order.setAddress(defaultAddress.getArea() + defaultAddress.getDetail());
			order.setReceiver(defaultAddress.getReceiver());
			order.setPhone(defaultAddress.getPhone());
			Byte kByte = 1;
			order.setType(kByte);
			BigDecimal Price = new BigDecimal(0.1);
			// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
			order.setTotalPrice(Price);
			order.setTotalSettlementPrice(Price);
			order.setFlag(kByte);
			order.setCreateTime(now);
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			orderMapper.insertSelective(order);
			session.commit();
			// 插入到order_good表
			order = orderMapper.selectByCreateTime(now);// 查询order.id
			OrderGood orderGood = new OrderGood();
			orderGood.setOrderId(order.getId());
			orderGood.setGoodId(getid);
			orderGood.setGoodName("代取快递");
			// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
			orderGood.setDiscountPrice(Price);
			orderGood.setShopPrice(Price);
			orderGood.setGoodQuantity(kByte);
			orderGood.setCreateTime(now);
			OrderGoodMapper orderGoodMapper = session.getMapper(OrderGoodMapper.class);
			orderGoodMapper.insertSelective(orderGood);
			session.commit();
			session.close();
			return "successful";
		} else {
			// 非加急送 插入到get表
			SqlSession session = SqlSessionTool.CreateSqlSession();
			GetMapper getMapper = session.getMapper(GetMapper.class);
			Get getExpress = new Get();
			getExpress.setCompany(company);
			getExpress.setPickCode(pickcode);
			getExpress.setType(type);
			Byte mByte = 0;
			getExpress.setIsUrgent(mByte);
			Date now = new Date();
			getExpress.setCreateTime(now);
			getMapper.insertSelective(getExpress);
			session.commit();
			Integer getid = getMapper.selectByTime(now).getId();// 获取getid
			// 获取userid
			cookies uCookies = new cookies();
			String getusername = uCookies.getusername(request);
			FinduserId finduserId = new FinduserId();
			Integer getuserid = finduserId.getuserid(getusername);
			// 获取默认地址
			IAddressService addressService = new AddressService();
			Address defaultAddress = addressService.GetdefaultAddressByUserId(getuserid);
			// 插入到order表
			Order order = new Order();
			order.setUserId(getuserid);
			order.setOrderStatusId(1);
			order.setRemark(remark);
			order.setAddress(defaultAddress.getArea() + defaultAddress.getDetail());
			order.setReceiver(defaultAddress.getReceiver());
			order.setPhone(defaultAddress.getPhone());
			Byte kByte = 1;
			order.setType(kByte);
			BigDecimal Price = new BigDecimal(0.1);
			// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
			order.setTotalPrice(Price);
			order.setTotalSettlementPrice(Price);
			order.setFlag(kByte);
			order.setCreateTime(now);
			OrderMapper orderMapper = session.getMapper(OrderMapper.class);
			orderMapper.insertSelective(order);
			session.commit();
			// 插入到order_good表
			order = orderMapper.selectByCreateTime(now);// 查询order.id
			OrderGood orderGood = new OrderGood();
			orderGood.setOrderId(order.getId());
			orderGood.setGoodId(getid);
			orderGood.setGoodName("代取快递");
			// 这里将价格全部上传为0.1，仅仅适用于快递而且需要在购买页面修改
			orderGood.setDiscountPrice(Price);
			orderGood.setShopPrice(Price);
			orderGood.setGoodQuantity(kByte);
			orderGood.setCreateTime(now);
			OrderGoodMapper orderGoodMapper = session.getMapper(OrderGoodMapper.class);
			orderGoodMapper.insertSelective(orderGood);
			session.commit();
			session.close();
			return "successful";
		}

	}
}
